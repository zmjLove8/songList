import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Admin on 2018/2/25.
 */
public class PlayList {
    //播放列表类
    private String playListName;
    private List<Song> musicList;

    public PlayList(){

    }
    public PlayList(String playListName, List musicList){
        this.setPlayListName(playListName);
        this.setMusicList(musicList);
        musicList = new ArrayList<>();
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Song> musicList) {
        this.musicList = musicList;
    }

    //将歌曲添加到播放列表
    public void addToPLayListSong(){
        Scanner console = new Scanner(System.in);
        boolean flag = true;
        Song song = null;
        System.out.println("请输入要添加的歌曲数量: ");
        int num = console.nextInt();
        for (int i=1; i<=num; i++){
            System.out.println("请输入第"+i+"首歌曲: ");
            System.out.println("请输入歌曲的id: ");
            String id1 = console.next();
            while (flag){
                song = new Song();
                if (musicList.size()==0){
                    song.setId(id1);
                    flag = false;
                    break;
                }else {
                    for (int j =0; j<musicList.size(); j++){
                        if (id1.equals(musicList.get(j).getId())){
                            System.out.println("该id已经存在，请重新输入!");
                            break;
                        }else {
                            song.setId(id1);
                            flag = false;
                            break;
                        }
                    }
                }
            }
            while (!flag){
                System.out.println("请输入歌曲的名称: ");
                String name1 = console.next();
                if (musicList.size()==0){
                    song.setName(name1);
                    flag = false;
                    break;
                }else {
                    for (int j =0; j<musicList.size(); j++){
                        if (name1.equals(musicList.get(j).getName())){
                            System.out.println("该歌曲名称已经存在，请重新输入!");
                            break;
                        }else {
                            song.setName(name1);
                            flag = false;
                            break;
                        }
                    }
                }
            }
            System.out.println("请输入演唱者: ");
            String singer1 = console.next();
            song.setSinger(singer1);
            musicList.add(song);
        }
    }

    //显示播放列表中所有歌曲
    public void displayAllSong(){
        if (musicList.size()==0){
            System.out.println("播放列表为空，请先添加歌曲!");
        }else {
            for (Song allSong: musicList) {
                System.out.println(allSong);
            }
        }
    }

    //通过id查询歌曲
    public Song searchSongById(){
        Scanner scanner = new Scanner(System.in);
        for(Song s : musicList){
            System.out.println("请输入要查询的歌曲id: ");
            String songId = scanner.next();
            if (s.getId().equals(songId)){
                System.out.println(s);
                break;
            }else {
                System.out.println("未找到该歌曲,请重新输入: ");
                continue;
            }
        }
        return null;
    }

    //通过名称查询歌曲
    public Song searchSongByName(){
        Scanner scanner = new Scanner(System.in);
        for (Song song : musicList){
            System.out.println("请输入要查询的歌曲名称");
            String songName = scanner.next();
            if (song.getName().equals(songName)){
                System.out.println(song);
                break;
            }else {
                System.out.println("该歌曲不存在,请重新输入: ");
                continue;
            }
        }
        return null;
    }

    //修改歌曲
    public void updateSong(){
        Scanner console = new Scanner(System.in);
        for (Song song : musicList){
            System.out.println("请输入要修改的歌曲id: ");
            String songId = console.next();
            if (song.getId().equals(songId)){
                System.out.println("请输入修改后的歌曲名称: ");
                String songName = console.next();
                song.setName(songName);
                System.out.println("请输入修改后的演唱者: ");
                String singer = console.next();
                song.setSinger(singer);
                System.out.println("修改成功!");
                for (Song song1 : musicList){
                    System.out.println(song1);
                }
                break;
            }else {
                System.out.println("该歌曲不存在，请重新输入: ");
                continue;
            }
        }
    }

    //从播放列表中删除歌曲
    public void deleteSong(){
        Scanner console = new Scanner(System.in);
        for (Song song2 : musicList){
            System.out.println("请输入要删除的歌曲id: ");
            String songId = console.next();
            if (songId.equals(song2.getId())){
                musicList.remove(song2);
                System.out.println("删除成功!");
                break;
            }else {
                System.out.println("未找到该歌曲，请重新输入: ");
                continue;
            }
        }
    }
}
