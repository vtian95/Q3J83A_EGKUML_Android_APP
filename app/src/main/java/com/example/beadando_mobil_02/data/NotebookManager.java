package com.example.beadando_mobil_02.data;
import android.provider.ContactsContract;

import com.example.beadando_mobil_02.domain.Notebook;

import java.util.ArrayList;
import java.util.List;
public class NotebookManager {

    public static List <Notebook> loadMockData() {
        List<Notebook> notebookList = new ArrayList<>();
        Notebook notebook = new Notebook("1", "HP", "COMPAQ", "95120 HUF" ,"15,6", "1024", "160GB", "ATi Mobility Radeon HD3200 256MB" );
        notebookList.add(notebook);
        notebook = new Notebook("2", "Asus", "K51AC-SX001D", "101200 HUF","15,6", "2048", "250GB", "ATi Mobility Radeon HD3200 256MB");
        notebookList.add(notebook);
        notebook = new Notebook("3", "HP", "COMPAQ 615 NX560EA", "114800 HUF","15,6", "2048", "320GB", "ATi Mobility Radeon HD3200 256MB");
        notebookList.add(notebook);
        notebook = new Notebook("4", "HP", "Pavilion DV6-1110EH NL956EA", "111920 HUF","15,6", "3072", "250GB", "ATi Mobility Radeon HD4530 512MB");
        notebookList.add(notebook);
        notebook = new Notebook("5", "ACER", "Aspire 5536G-642G25MN", "111920 HUF","15,6", "2048", "250GB", "ATi Mobility Radeon HD4530 512MB");
        notebookList.add(notebook);
        notebook = new Notebook("6", "MSI", "X410-019HU", "111920 HUF","15,6", "3072", "320GB", "ATi Mobility Radeon HD4530 512MB");
        notebookList.add(notebook);
        notebook = new Notebook("7", "Asus", "F83T-VX005X", "115920 HUF","14", "2048", "320GB", "ATI Radeon Xpress 1250");
        notebookList.add(notebook);
        notebook = new Notebook("8", "MSI", "VR630XL-004HU", "90800 HUF","14", "4096", "500GB", "ATi Mobility Radeon HD4570 512MB");
        notebookList.add(notebook);
        notebook = new Notebook("9", "ASUS", "N60DP-JX012V", "183920 HUF","16", "2048", "320GB", "NVIDIA GeForce Go 9100M-GS");
        notebookList.add(notebook);
        notebook = new Notebook("10", "Asus", "K50AB-SX045D", "134320 HUF","16", "2048", "500GB", "ATi Mobility Radeon HD4670 512MB");
        notebookList.add(notebook);
        notebook = new Notebook("11", "Asus", "K50AB-SX045D", "134320 HUF","15,6", "1024", "500GB", "ATi Mobility Radeon HD4670 512MB");
        notebookList.add(notebook);
        notebook = new Notebook("12", "Fujitsu", "Amilo Sa3650", "223920 HUF","13,3", "1024", "250GB", "ATi Mobility Radeon HD3200 256MB");
        notebookList.add(notebook);
        notebook = new Notebook("13", "MSI", "WIND U200-064HU", "112400 HUF","12", "2048", "320GB", "Intel Graphics X4500M / 256MB");
        notebookList.add(notebook);
        notebook = new Notebook("14", "ACER", "eMachine E525-901G16Mi", "112400 HUF","15,6", "2048", "160GB", "NVIDIA GeForce Go 8200M 128MB");
        notebookList.add(notebook);
        notebook = new Notebook("15", "DELL", "Inspiron 1545-106208 RED", "103120 HUF","15,6", "1024", "160GB", "NVIDIA GeForce Go 8200M 128MB");
        notebookList.add(notebook);



        return notebookList;
    }

}
