# ToDoNotepad(Todo list)

## 制作小组成员
* 张焱-18130500160（组长）【zy052】
* 胡健榕-18130500164【canghaiyisheng2】
* 赵荣亮-18130500170【yilishabais】
* 杨正宏志-19030100016【86139】

注：【】框内为各成员账户名称,其中由于未知原因，杨同学以匿名86139进行提交。

## 作业项目要求
* 以小组为单位，根据所给出需求，将其进行合理拆分（拆分出的每个需求只做一件事）
* 以TDD的方式实现拆分后需求（测试+实现）
* 工程文件具有较强可读性

## 项目需求
客户：“我们需要一个应用程序，用来记录我们的待办事项列表，能够添加、删除待办事项，也能够把待办的事项修改为完成。”

## 需求分析
* 存储待办事项：应当能够存储待办事项列表（以文件方式存储）。
* 添加待办事项：当用户添加一个代办事项，会在代办事项列表的末尾添加该事项。
* 删除待办事项：当用户指定删除某待办事项，应当将该待办事项直接从待办事项列表中除去。
* 完成待办事项：当用户完成待办事项时可以将其状态设置为已完成，且不应当从待办事项列表中删除。

## 分工情况
* 测试：张焱
* 添加待办事项：赵荣亮
* 删除待办事项：胡健榕
* 完成待办事项：杨正宏志
* 代码优化： 张焱，胡健榕

## 开发环境与依赖
JAVA + Idea + Github

## 基本思路
* 测试程序的实现：主要以查找算法辅助测试每次的增删等操作是否实现。通过重写等面向对象思想及重构方法提高代码的质量
* 具体项目实现：主要运用容器ArrayList对整个待办事项列表进行增删等的管理，并在每次操作前后将存储文件中的列表读出或写入。

## 说明
该项目的主体测试代码位于src/test/java/ToDoNotepad目录下，实现代码位于src/main/java/ToDoNotepad目录下，NotePad文件即为项目的存储文件，其余文件以配置文件为主。
由于该项目仅要求实现基本需求并通过相关测试，故未做出相关图形化界面。



