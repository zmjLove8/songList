import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Admin on 2018/2/25.
 */
public class PlayListCollection {
    Map<String,PlayList> playListMap;

    public PlayListCollection(){

    }
    public PlayListCollection(Map<String,PlayList> playListMap){
        this.setPlayListMap(playListMap);
    }

    public Map<String, PlayList> getPlayListMap() {
        return playListMap;
    }

    public void setPlayListMap(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
    }

    Scanner console = new Scanner(System.in);
    //添加播放列表
    public void addPlayList(PlayList playList){
        System.out.println("输入要添加的播放列表名称");
        String listName = console.next();
        if (playList.getPlayListName().equals(listName)){
            System.out.println("该播放列表已经存在! ");
        }else {
            playList.setPlayListName(listName);
            playListMap.put(playList.getPlayListName(),playList);
        }
    }

    //删除播放列表
    public void deletePlayList(){
        System.out.println("请输入要删除的播放列表名称: ");
        String s = console.next();
        if (playListMap.containsKey(s)){
            playListMap.remove(s);
            System.out.println("该播放列表已经移除!");
        }else {
            System.out.println("该播放列表不存在!");
        }
    }

    //通过名字查询播放列表
    public PlayList searchPlayListByName(){
        System.out.println("请输入要查询的播放列表名称: ");
        String listName = console.next();
        if (playListMap.containsKey(listName)){
            System.out.println("该播放列表存在!");
        }else {
            System.out.println("该播放列表没找到");
        }
        return null;
    }

    //显示所有播放列表名称
    public void displayPlayListName(){
        System.out.println("所有播放列表名称为: ");
        Iterator<String> allList = playListMap.keySet().iterator();
        while (allList.hasNext()){
            System.out.println(allList.next());
        }
    }
}
