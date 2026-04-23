package org.neonangellock.azurecanvas.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public class StoryMapDTO {
    private UUID storyMapId;
    private String title;
    private String description;
    private UUID authorId;
    private String author;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private String coverImageUrl;
    private List<LocationDTO> locations;
    private Integer likes;
    private String comments;
    private BigDecimal lat;
    private BigDecimal lng;
    private String category;
    private String location;

    public StoryMapDTO() {}

    public StoryMapDTO(UUID storyMapId, String title, String description, UUID authorId, String author,
                       OffsetDateTime createdAt, OffsetDateTime updatedAt, String coverImageUrl,
                       List<LocationDTO> locations, Integer likes, String comments, BigDecimal lat,
                       BigDecimal lng, String category, String location) {
        this.storyMapId = storyMapId;
        this.title = title;
        this.description = description;
        this.authorId = authorId;
        this.author = author;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.coverImageUrl = coverImageUrl;
        this.locations = locations;
        this.likes = likes;
        this.comments = comments;
        this.lat = lat;
        this.lng = lng;
        this.category = category;
        this.location = location;
    }

    public UUID getStoryMapId() { return storyMapId; }
    public void setStoryMapId(UUID storyMapId) { this.storyMapId = storyMapId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public UUID getAuthorId() { return authorId; }
    public void setAuthorId(UUID authorId) { this.authorId = authorId; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(OffsetDateTime updatedAt) { this.updatedAt = updatedAt; }
    public String getCoverImageUrl() { return coverImageUrl; }
    public void setCoverImageUrl(String coverImageUrl) { this.coverImageUrl = coverImageUrl; }
    public List<LocationDTO> getLocations() { return locations; }
    public void setLocations(List<LocationDTO> locations) { this.locations = locations; }
    public Integer getLikes() { return likes; }
    public void setLikes(Integer likes) { this.likes = likes; }
    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
    public BigDecimal getLat() { return lat; }
    public void setLat(BigDecimal lat) { this.lat = lat; }
    public BigDecimal getLng() { return lng; }
    public void setLng(BigDecimal lng) { this.lng = lng; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private UUID storyMapId;
        private String title;
        private String description;
        private UUID authorId;
        private String author;
        private OffsetDateTime createdAt;
        private OffsetDateTime updatedAt;
        private String coverImageUrl;
        private List<LocationDTO> locations;
        private Integer likes;
        private String comments;
        private BigDecimal lat;
        private BigDecimal lng;
        private String category;
        private String location;

        public Builder storyMapId(UUID storyMapId) { this.storyMapId = storyMapId; return this; }
        public Builder title(String title) { this.title = title; return this; }
        public Builder description(String description) { this.description = description; return this; }
        public Builder authorId(UUID authorId) { this.authorId = authorId; return this; }
        public Builder author(String author) { this.author = author; return this; }
        public Builder createdAt(OffsetDateTime createdAt) { this.createdAt = createdAt; return this; }
        public Builder updatedAt(OffsetDateTime updatedAt) { this.updatedAt = updatedAt; return this; }
        public Builder coverImageUrl(String coverImageUrl) { this.coverImageUrl = coverImageUrl; return this; }
        public Builder locations(List<LocationDTO> locations) { this.locations = locations; return this; }
        public Builder likes(Integer likes) { this.likes = likes; return this; }
        public Builder comments(String comments) { this.comments = comments; return this; }
        public Builder lat(BigDecimal lat) { this.lat = lat; return this; }
        public Builder lng(BigDecimal lng) { this.lng = lng; return this; }
        public Builder category(String category) { this.category = category; return this; }
        public Builder location(String location) { this.location = location; return this; }

        public StoryMapDTO build() {
            return new StoryMapDTO(storyMapId, title, description, authorId, author, createdAt, updatedAt,
                    coverImageUrl, locations, likes, comments, lat, lng, category, location);
        }
    }

    public static class LocationDTO {
        private UUID locationId;
        private BigDecimal lat;
        private BigDecimal lng;
        private String title;
        private String description;
        private String imageUrl;

        public LocationDTO() {}

        public LocationDTO(UUID locationId, BigDecimal lat, BigDecimal lng, String title, String description, String imageUrl) {
            this.locationId = locationId;
            this.lat = lat;
            this.lng = lng;
            this.title = title;
            this.description = description;
            this.imageUrl = imageUrl;
        }

        public UUID getLocationId() { return locationId; }
        public void setLocationId(UUID locationId) { this.locationId = locationId; }
        public BigDecimal getLat() { return lat; }
        public void setLat(BigDecimal lat) { this.lat = lat; }
        public BigDecimal getLng() { return lng; }
        public void setLng(BigDecimal lng) { this.lng = lng; }
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
        public String getImageUrl() { return imageUrl; }
        public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

        public static LocationDTO.Builder builder() { return new LocationDTO.Builder(); }

        public static class Builder {
            private UUID locationId;
            private BigDecimal lat;
            private BigDecimal lng;
            private String title;
            private String description;
            private String imageUrl;

            public Builder locationId(UUID locationId) { this.locationId = locationId; return this; }
            public Builder lat(BigDecimal lat) { this.lat = lat; return this; }
            public Builder lng(BigDecimal lng) { this.lng = lng; return this; }
            public Builder title(String title) { this.title = title; return this; }
            public Builder description(String description) { this.description = description; return this; }
            public Builder imageUrl(String imageUrl) { this.imageUrl = imageUrl; return this; }

            public LocationDTO build() {
                return new LocationDTO(locationId, lat, lng, title, description, imageUrl);
            }
        }
    }
}