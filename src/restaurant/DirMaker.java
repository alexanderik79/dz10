package restaurant;

import java.io.File;
    public class DirMaker {
        public void makedir (){
                File dir = new File("src/resBar/");
                dir.mkdirs();
                dir = new File("src/resKitchen/");
                dir.mkdirs();
            }
        }
