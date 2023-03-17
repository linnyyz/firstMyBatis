import Mapper.PeopleCardMapper;
import Mapper.PeopleMapper;
import POJO.People;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis_config.xml");
        //根据配置文件构建SqlSessionFactory创建SqlSession
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        //SqlSessionFactory创建SqlSession
        SqlSession ss = ssf.openSession(true);
        //SqlSession执行文件中定义的SQL，并返回映射结果
        //添加人
        People people = new People();
        people.setName("狗博");
        PeopleMapper peopleMapper = ss.getMapper(PeopleMapper.class);
        PeopleCardMapper peopleCardMapper = ss.getMapper(PeopleCardMapper.class);

//        try {
            //添加
//            peopleMapper.addPeople(people);
//            ss.insert("Mapper.PeopleMapper.addPeople",people);
//            System.out.println("添加成功");
              List<People> peopleList = peopleMapper.selectById(0);
              for(People people1 : peopleList){
                  System.out.println(people1);
              }

            //删除
//            peopleMapper.deleteByName("狗博");
//            System.out.println("删除成功");

            //查询所有
//            List<People> peopleList = ss.selectList("Mapper.PeopleMapper.selectAll");
//            List<People> peopleList = peopleMapper.selectAll();
//            for (People a : peopleList){
//                System.out.println(a);
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println(peopleMapper.selectTest2(1));
//        System.out.println(peopleCardMapper.selectByPeoId(1));
        //提交事务

        //关闭
        config.close();
        ss.close();
    }
}
