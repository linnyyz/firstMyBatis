package Mapper;

import POJO.People;

import java.util.List;

public interface PeopleMapper {
    public boolean addPeople(People people);
    public List<People> selectAll();
    public List<People> selectById(int people_id);
    public boolean deleteByName(String people_name);
    public People selectTest(int people_id);
    public People selectTest2(int people_id);
}
