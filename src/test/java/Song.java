

/**
 * Created by Admin on 2018/2/25.
 */
public class Song {
    private String id;
    private String name;
    private String singer;

    public Song(){

    }
    public Song(String id,String name,String singer){
        this.setId(id);
        this.setName(name);
        this.setSinger(singer);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o)
            return true;
        if (o.getClass()== Song.class){
            Song song = (Song) o;
            return song.getId().equals(id)&&(song.getName().equals(name))&&(song.getSinger().equals(singer));
        }
        return false;

    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getSinger().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "歌曲{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
