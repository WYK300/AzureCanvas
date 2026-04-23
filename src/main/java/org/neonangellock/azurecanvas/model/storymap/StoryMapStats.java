package org.neonangellock.azurecanvas.model.storymap;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "story_map_stats")
public class StoryMapStats {
    @Id
    @Column(name = "storymapid", nullable = false)
    private UUID storyMapId;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "storymapid")
    private StoryMap storyMap;

    @Column(name = "authorId", nullable = false)
    private UUID authorId;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt = OffsetDateTime.now();

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt = OffsetDateTime.now();

    @Column(name = "likescount", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int likesCount;

    @Column(name = "viewscount", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int viewsCount;

    @Column(name = "commentcount", nullable = false, columnDefinition = "INT DEFAULT 0")
    private int commentCount;

    public UUID getStoryMapId() { return storyMapId; }
    public void setStoryMapId(UUID storyMapId) { this.storyMapId = storyMapId; }
    public StoryMap getStoryMap() { return storyMap; }
    public void setStoryMap(StoryMap storyMap) { this.storyMap = storyMap; }
    public UUID getAuthorId() { return authorId; }
    public void setAuthorId(UUID authorId) { this.authorId = authorId; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(OffsetDateTime updatedAt) { this.updatedAt = updatedAt; }
    public int getLikesCount() { return likesCount; }
    public void setLikesCount(int likesCount) { this.likesCount = likesCount; }
    public int getViewsCount() { return viewsCount; }
    public void setViewsCount(int viewsCount) { this.viewsCount = viewsCount; }
    public int getCommentCount() { return commentCount; }
    public void setCommentCount(int commentCount) { this.commentCount = commentCount; }
}
