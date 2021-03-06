
package com.mylink.sdk.admin.modules.system.service.dto;

import lombok.Data;
import com.mylink.sdk.admin.annotation.Query;

/**
* @author admin
* @date 2019-04-10
*/
@Data
public class DictDetailQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String label;

    @Query(propName = "name",joinName = "dict")
    private String dictName;
}