package org.neonangellock.azurecanvas.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public class ItemDTO {
    private UUID itemId;
    private String title;
    private String description;
    private BigDecimal price;
    private UUID sellerId;
    private String sellerUsername;
    private String sellerAvatarUrl;
    private OffsetDateTime createdAt;
    private String status;
    private List<String> images;
    private String category;
    private Integer views;
    private String location;

    public ItemDTO() {}

    public ItemDTO(UUID itemId, String title, String description, BigDecimal price, UUID sellerId,
                   String sellerUsername, String sellerAvatarUrl, OffsetDateTime createdAt, String status,
                   List<String> images, String category, Integer views, String location) {
        this.itemId = itemId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.sellerId = sellerId;
        this.sellerUsername = sellerUsername;
        this.sellerAvatarUrl = sellerAvatarUrl;
        this.createdAt = createdAt;
        this.status = status;
        this.images = images;
        this.category = category;
        this.views = views;
        this.location = location;
    }

    public UUID getItemId() { return itemId; }
    public void setItemId(UUID itemId) { this.itemId = itemId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public UUID getSellerId() { return sellerId; }
    public void setSellerId(UUID sellerId) { this.sellerId = sellerId; }
    public String getSellerUsername() { return sellerUsername; }
    public void setSellerUsername(String sellerUsername) { this.sellerUsername = sellerUsername; }
    public String getSellerAvatarUrl() { return sellerAvatarUrl; }
    public void setSellerAvatarUrl(String sellerAvatarUrl) { this.sellerAvatarUrl = sellerAvatarUrl; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public List<String> getImages() { return images; }
    public void setImages(List<String> images) { this.images = images; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public Integer getViews() { return views; }
    public void setViews(Integer views) { this.views = views; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private UUID itemId;
        private String title;
        private String description;
        private BigDecimal price;
        private UUID sellerId;
        private String sellerUsername;
        private String sellerAvatarUrl;
        private OffsetDateTime createdAt;
        private String status;
        private List<String> images;
        private String category;
        private Integer views;
        private String location;

        public Builder itemId(UUID itemId) { this.itemId = itemId; return this; }
        public Builder title(String title) { this.title = title; return this; }
        public Builder description(String description) { this.description = description; return this; }
        public Builder price(BigDecimal price) { this.price = price; return this; }
        public Builder sellerId(UUID sellerId) { this.sellerId = sellerId; return this; }
        public Builder sellerUsername(String sellerUsername) { this.sellerUsername = sellerUsername; return this; }
        public Builder sellerAvatarUrl(String sellerAvatarUrl) { this.sellerAvatarUrl = sellerAvatarUrl; return this; }
        public Builder createdAt(OffsetDateTime createdAt) { this.createdAt = createdAt; return this; }
        public Builder status(String status) { this.status = status; return this; }
        public Builder images(List<String> images) { this.images = images; return this; }
        public Builder category(String category) { this.category = category; return this; }
        public Builder views(Integer views) { this.views = views; return this; }
        public Builder location(String location) { this.location = location; return this; }

        public ItemDTO build() {
            return new ItemDTO(itemId, title, description, price, sellerId, sellerUsername, sellerAvatarUrl,
                    createdAt, status, images, category, views, location);
        }
    }
}