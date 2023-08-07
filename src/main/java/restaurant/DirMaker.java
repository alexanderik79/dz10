package restaurant;

import java.io.File;
    public class DirMaker {
        public static void makedir (){
                File dir = new File("src/resBar/");
                dir.mkdirs();
                dir = new File("src/resKitchen/");
                dir.mkdirs();
                dir = new File("src/resGravyKitchen/");
                dir.mkdirs();
                dir = new File("src/resPastryKitchen/");
                dir.mkdirs();
            }
        }
