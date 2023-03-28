package com.sub.patterns.business.transferObjectAssembler;

import java.util.ArrayList;
import java.util.List;

public class ProjectDetailsAssembler {

    public ProjectDetailsData getProjectDetails(String projectId) {

        ProjectTo projectTo = new ProjectTo("1", "name1");
        TaskTo task = new TaskTo("1", "task1", "1");
        ResourceTo resourceTo = new ResourceTo("1", "resource1");
        TaskResourceTo taskResourceTo = new TaskResourceTo(resourceTo, task);
        List<TaskResourceTo> tasks = new ArrayList<>();
        tasks.add(taskResourceTo);

        return new ProjectDetailsData(projectTo, tasks);
    }
}
