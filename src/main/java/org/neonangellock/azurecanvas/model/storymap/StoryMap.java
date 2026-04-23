package org.neonangellock.azurecanvas.model.storymap;

import jakarta.persistence.*;
import lombok.ToString;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "story_maps")
@ToString
public class StoryMap {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "storyMapId", nullable = false)
    private UUID storyMapId;

    @OneToOne(mappedBy = "storyMap", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private StoryMapStats stats;

    @Column(name = "authorId", nullable = false)
    private UUID authorId;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "coverImageUrl")
    private String coverImageUrl;

    @Column(name = "createdAt", nullable = false, updatable = false)
    private OffsetDateTime createdAt = OffsetDateTime.now();

    @Column(name = "updatedAt", nullable = false)
    private OffsetDateTime updatedAt = OffsetDateTime.now();

    @OneToMany(mappedBy = "storyMap", cascade = CascadeType.ALL, orphanRemoval = true)
    private java.util.List<StoryMapLocation> locations;

    @PreUpdate
    protected void onUpdate() {
        updatedAt = OffsetDateTime.now();
    }

    public UUID getStoryMapId() { return storyMapId; }
    public void setStoryMapId(UUID storyMapId) { this.storyMapId = storyMapId; }
    public StoryMapStats getStats() { return stats; }
    public void setStats(StoryMapStats stats) { this.stats = stats; }
    public UUID getAuthorId() { return authorId; }
    public void setAuthorId(UUID authorId) { this.authorId = authorId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getCoverImageUrl() { return coverImageUrl; }
    public void setCoverImageUrl(String coverImageUrl) { this.coverImageUrl = coverImageUrl; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }
    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(OffsetDateTime updatedAt) { this.updatedAt = updatedAt; }
    public java.util.List<StoryMapLocation> getLocations() { return locations; }
    public void setLocations(java.util.List<StoryMapLocation> locations) { this.locations = locations; }
}
