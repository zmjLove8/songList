import java.util.Scanner;

/**
 * Created by Admin on 2018/2/25.
 */
public class TestDemo {
    public static void main(String[] args) {
        PlayList pl = new PlayList();
        PlayListCollection plc = new PlayListCollection();
        Scanner console = new Scanner(System.in);
        boolean flag = false;
        int n = 0;
        while (true){
            menu();
            while (!flag){
                n = console.nextInt();
                switch (n){
                    case 1:
                        while (!flag){
                            playListInfo();
                            n = console.nextInt();
                            switch (n){
                                case 1:
                                    pl.addToPLayListSong();
                                    break;
                                case 2:

                                    break;
                                case 3:
                                    pl.searchSongById();
                                    break;
                                case 4:
                                    pl.searchSongByName();
                                    break;
                                case 5:
                                    pl.updateSong();
                                    break;
                                case 6:
                                    pl.deleteSong();
                                    break;
                                case 7:
                                    pl.displayAllSong();
                                    break;
                                case 8:
                                    break;
                                case 9:
                                    flag = true;
                                    break;
                                default:
                                    System.out.println("你输入的有误，请重新输入: ");
                                    continue;
                            }
                        }
                        break;
                    case 2:
                        playerInfo();
                        n = console.nextInt();
                        while (flag){
                            switch (n){
                                case 1:
                                    plc.addPlayList(pl);
                                    break;
                                case 2:
                                    plc.deletePlayList();
                                    break;
                                case 3:
                                    plc.searchPlayListByName();
                                    break;
                                case 4:
                                    plc.displayPlayListName();
                                    break;
                                case 9:
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("你输入的有误，请重新输入: ");
                                    continue;
                            }
                        }
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("你输入的数字有误，请重新输入: ");
                        continue;
                }
            }
        }
    }


    public static void playListInfo(){
        System.out.println("*******************************************************");
        System.out.println("                 **播放列表管理**                      ");
        System.out.println("                 1--将歌曲添加到主播放列表             ");
        System.out.println("                 2--将歌曲添加到普通播放列表           ");
        System.out.println("                 3--通过歌曲id查询播放列表中的歌曲     ");
        System.out.println("                 4--通过歌曲名称查询播放列表中的歌曲   ");
        System.out.println("                 5--修改播放列表中的歌曲               ");
        System.out.println("                 6--删除播放列表中的歌曲               ");
        System.out.println("                 7--显示播放列表中的所有歌曲           ");
        System.out.println("                 8--导出歌单                           ");
        System.out.println("                 9--返回上一级菜单                     ");
        System.out.println("*******************************************************");
        System.out.println("请输入对应的数字对播放列表进行管理: ");
    }
    public static void playerInfo(){
        System.out.println("***********************************************");
        System.out.println("               **播放器管理**                  ");
        System.out.println("               1--向播放器添加播放列表         ");
        System.out.println("               2--从播放器删除播放列表         ");
        System.out.println("               3--通过名字查询播放列表信息     ");
        System.out.println("               4--显示所有播放列表名称         ");
        System.out.println("               9--返回上一级菜单               ");
        System.out.println("***********************************************");
        System.out.println("请输入对应的数字对播放器进行管理: ");
    }
    public static void menu(){
        System.out.println("***********************************************");
        System.out.println("               **主菜单**                      ");
        System.out.println("               1--播放列表管理                 ");
        System.out.println("               2--播放器管理                   ");
        System.out.println("               0--退出                         ");
        System.out.println("***********************************************");
        System.out.println("请输入对应的数字进行操作: ");
    }
}
