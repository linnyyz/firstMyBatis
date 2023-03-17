package Mapper;

import POJO.Thing;

import java.util.List;

public interface ThingMapper {
    public List<Thing> selectByPeoId(int people_id);
}
