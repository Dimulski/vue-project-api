package dimulski.vueprojectapi.entities;

import dimulski.vueprojectapi.entities.contracts.TitledEntity;

import javax.persistence.*;

@Entity
@Table(name = "photos")
public class Photo extends TitledEntity {

    @Column(name = "album_id", nullable = false)
    private long albumId;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "thumbnail_url", nullable = false)
    private String thumbnailUrl;

    public Photo() {
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
