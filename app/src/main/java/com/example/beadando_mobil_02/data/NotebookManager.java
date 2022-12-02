package com.example.beadando_mobil_02.data;
import android.provider.ContactsContract;

import com.example.beadando_mobil_02.domain.Notebook;

import java.util.ArrayList;
import java.util.List;
public class NotebookManager {

    public static List <Notebook> loadMockData() {
        List<Notebook> notebookList = new ArrayList<>();
        Notebook notebook = new Notebook("1", "HP", "COMPAQ", "95120 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("2", "Asus", "K51AC-SX001D", "101200 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("3", "HP", "COMPAQ 615 NX560EA", "114800 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("4", "HP", "Pavilion DV6-1110EH NL956EA", "111920 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("5", "ACER", "Aspire 5536G-642G25MN", "111920 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("6", "MSI", "X410-019HU", "111920 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("7", "Asus", "F83T-VX005X", "115920 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("8", "MSI", "VR630XL-004HU", "90800 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("9", "ASUS", "N60DP-JX012V", "183920 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("10", "Asus", "K50AB-SX045D", "134320 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("11", "Asus", "K50AB-SX045D", "134320 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("12", "Fujitsu", "Amilo Sa3650", "223920 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("13", "MSI", "WIND U200-064HU", "112400 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("14", "ACER", "eMachine E525-901G16Mi", "112400 HUF");
        notebookList.add(notebook);
        notebook = new Notebook("15", "DELL", "Inspiron 1545-106208 RED", "103120 HUF");
        notebookList.add(notebook);



        return notebookList;
    }

}
