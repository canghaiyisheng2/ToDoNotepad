/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ToDoNotepad;

import java.io.*;
import java.util.ArrayList;

class Item{
    String itemName;
    String itemTime;
    String isFinished; //涉及到文件读写问题,故改为字符串，暂时不影响使用

    public Item(String name, String time)
    {
        this.itemName = name;
        this.itemTime = time;
        this.isFinished = "False";
    }

}

class App{
    ArrayList<Item> Itemlist = new ArrayList<Item>();


    public App()throws Exception{

        //InputStreamReader read = new InputStreamReader(new FileInputStream("NotePad.txt"), "gbk");
        //BufferedReader fr = new BufferedReader(read);
        BufferedReader fr = new BufferedReader(new FileReader("NotePad.txt"));
        String tempString = "";
        //read txt
        while((tempString = fr.readLine()) != null) {

            String[] takon;
            takon = tempString.split(" ");
            Item item = new Item(takon[0], takon[1]);
            item.isFinished = takon[2];

            Itemlist.add(item);
        }

    }

    public void WriteFile() throws Exception {
        File file=new File("NotePad.txt");
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        for (Item item : Itemlist) {
            bw.write(item.itemName + ' ');
            bw.write(item.itemTime + ' ');
            bw.write(item.isFinished + ' ');
            bw.newLine();
        }
        bw.close();
    }

    public int  SearchTheItem(String name)
    {
        for(int i=0;i<Itemlist.size();i++){
            if(Itemlist.get(i).itemName.equals(name))
                return i;
        }
        return -1;
    }

    public void AddTheItem(String name,String time)  //增加条目
    {
        //不允许同名事项
        if (SearchTheItem(name) == -1) {
            Item item = new Item(name,time);
            Itemlist.add(item);
            System.out.println(Itemlist.get(0).itemName);
        }

        try {
            WriteFile();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteTheItem(String name)
    {
        try {
            int index = SearchTheItem(name);
            Itemlist.remove(index);
            WriteFile();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Item not exist!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

/*    public void FinishTheItem(name)
      {
        SearchTheItem(name);
        根据下表修改isfinished变量。
       }*/

}


