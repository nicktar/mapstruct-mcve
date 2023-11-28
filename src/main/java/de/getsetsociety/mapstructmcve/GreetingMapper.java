package de.getsetsociety.mapstructmcve;

import de.getsetsociety.mapstructmcve.data.Greeting;
import de.getsetsociety.mapstructmcve.data.GreetingDto;
import de.getsetsociety.mapstructmcve.data.Target;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GreetingMapper {

    GreetingMapper INSTANCE = Mappers.getMapper(GreetingMapper.class);

    @Mapping(target = "target", source = "target")
    Greeting update (@MappingTarget Greeting greeting, GreetingDto dto, Target target);
}
