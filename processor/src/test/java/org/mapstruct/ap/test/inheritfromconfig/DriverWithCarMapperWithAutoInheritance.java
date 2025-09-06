/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.inheritfromconfig;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Jean Tissot
 */
@Mapper(
    config = AutoInheritedConfig.class
)
public interface DriverWithCarMapperWithAutoInheritance {
    DriverWithCarMapperWithAutoInheritance INSTANCE = Mappers.getMapper( DriverWithCarMapperWithAutoInheritance.class );

    @Mapping(target = "driverName", source = "name")
    DriverWithCarEntity toDriverWithCarEntity(DriverWithCarDto driverWithCarDto);
}
