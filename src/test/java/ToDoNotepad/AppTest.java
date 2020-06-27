/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ToDoNotepad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    boolean IfTheItemExist(String name)throws Exception
    {
        //若写入成功，则可以查找到，返回ture，若删除成功，则找不到，返回false
        App app = new App();

        if(app.SearchTheItem(name) != -1)
        return true;
        return false;
    }


    @Test
    void ShouldReturnTrueWhenAddSuccessed() throws Exception {
        App app = new App();
        app.AddTheItem("洗澡","9:00");
        Assertions.assertEquals(true,IfTheItemExist("洗澡"));
    }
    @Test
    void ShouldReturnTrueWhenDeleteSuccessed() throws Exception {
        App app = new App();
        app.DeleteTheItem("洗澡");
        Assertions.assertEquals(false,IfTheItemExist("洗澡"));
    }

}
