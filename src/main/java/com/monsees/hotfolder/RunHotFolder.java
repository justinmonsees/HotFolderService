/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monsees.hotfolder;

import com.alexkasko.installer.DaemonLauncher;
/**
 *
 * @author prepress
 */
public class RunHotFolder implements DaemonLauncher {

    private HotFolder myHotFolderService;   
    
    public RunHotFolder(){
       myHotFolderService = new HotFolder();     
    }
    public void startDaemon() {
        myHotFolderService.run();
    }

    public void stopDaemon() {
        System.exit(0);
    }
    
}
