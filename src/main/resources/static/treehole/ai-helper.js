// AI助手配置
const AI_CONFIG = {
    apiKey: 'sk-1ae47925-595f-4896-9ed4-4e5835ac828e',
    baseUrl: 'https://ai-apigateway.must.edu.mo/openhub/v1/chat/completions',
    model: 'gpt-4o-mini'
};

// AI助手功能
class AIHelper {
    constructor() {
        this.apiKey = AI_CONFIG.apiKey;
        this.baseUrl = AI_CONFIG.baseUrl;
        this.model = AI_CONFIG.model;
        this.conversationHistory = [];
        // 初始化系统提示词
        this.systemPrompt = {
            role: 'system',
            content: '你是一个校园树洞AI助手，专门为大学生提供帮助和支持。你的名字叫小树苗，性格活泼开朗，充满青春活力。\n\n你需要：\n1. 友好、耐心地回答用户的问题\n2. 提供有用的建议和信息\n3. 保护用户的隐私\n4. 理解大学生的生活和学习困扰\n5. 鼓励积极向上的心态\n6. 记住用户之前说过的话，保持对话的连贯性\n\n你可以帮助用户：\n- 解答学习上的问题\n- 提供生活建议\n- 倾听情感困扰\n- 推荐校园活动\n- 分享有趣的话题\n\n请用自然、口语化的语言与用户交流，让用户感受到温暖和支持。'
        };
    }

    // 生成模拟回复
    generateMockResponse(message) {
        // 简单的关键词匹配，生成不同的回复
        message = message.toLowerCase();

        if (message.includes('你好') || message.includes('嗨') || message.includes('Hello') || message.includes('hi')) {
            return '你好！我是小树苗，你的校园树洞AI助手。今天有什么可以帮到你的吗？';
        } else if (message.includes('学习') || message.includes('考试') || message.includes('作业')) {
            return '学习上遇到困难了吗？别担心，我们一起想办法。你可以告诉我具体是什么科目或者问题，我会尽力帮助你！';
        } else if (message.includes('心情') || message.includes('难过') || message.includes('开心') || message.includes('情绪')) {
            return '我能感受到你的情绪。无论你是开心还是难过，我都在这里倾听你。能告诉我发生了什么事吗？';
        } else if (message.includes('推荐') || message.includes('建议')) {
            return '当然可以！你是想了解校园活动、学习资源，还是生活建议呢？告诉我更多细节，我会给你最适合的推荐。';
        } else if (message.includes('再见') || message.includes('拜拜')) {
            return '再见！希望我能帮到你。如果你还有其他问题，随时可以来找我哦！';
        } else {
            return '谢谢你的分享！我很乐意听你说更多。有什么具体的问题或者想法，都可以告诉我，我会认真回应你的。';
        }
    }

    async sendMessage(message, onChunk, onComplete) {
        try {
            console.log('AI API调用:', message);

            // 添加用户消息到对话历史
            this.conversationHistory.push({
                role: 'user',
                content: message
            });

            // 由于前端直连校外接口会触发CORS跨域拦截，我们暂时使用模拟响应
            // 实际项目中，需要在后端服务器上进行API调用，然后前端从后端获取结果

            // 生成模拟响应
            const mockResponse = this.generateMockResponse(message);

            // 添加AI回复到对话历史
            this.conversationHistory.push({
                role: 'assistant',
                content: mockResponse
            });

            // 限制对话历史长度，避免内存占用过高
            if (this.conversationHistory.length > 20) {
                this.conversationHistory = this.conversationHistory.slice(-20);
            }

            // 模拟流式输出
            let index = 0;
            const interval = setInterval(() => {
                if (index < mockResponse.length) {
                    const chunk = mockResponse.charAt(index);
                    if (onChunk) {
                        onChunk(chunk);
                    }
                    index++;
                } else {
                    clearInterval(interval);
                    if (onComplete) {
                        onComplete(mockResponse);
                    }
                }
            }, 50);

            return { message: mockResponse };
        } catch (error) {
            console.error('AI API error:', error);

            // 如果API调用失败，使用默认模拟响应
            const defaultResponse = '我是小树苗，你的校园树洞AI助手。抱歉，我刚才有点走神了，能再告诉我你需要什么帮助吗？';

            // 添加AI回复到对话历史
            this.conversationHistory.push({
                role: 'assistant',
                content: defaultResponse
            });

            // 模拟流式输出
            let index = 0;
            const interval = setInterval(() => {
                if (index < defaultResponse.length) {
                    const chunk = defaultResponse.charAt(index);
                    if (onChunk) {
                        onChunk(chunk);
                    }
                    index++;
                } else {
                    clearInterval(interval);
                    if (onComplete) {
                        onComplete(defaultResponse);
                    }
                }
            }, 50);

            return { message: defaultResponse };
        }
    }

    // 重置对话历史
    resetConversation() {
        this.conversationHistory = [];
    }
}