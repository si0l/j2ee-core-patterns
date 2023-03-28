package com.sub.patterns.business.transferObjectAssembler;

import java.util.Collection;

public record ProjectDetailsData(ProjectTo projectData, Collection<TaskResourceTo> tasks) {

}
