package com.core.basicspring2.ordered;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderedExample {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigOrdered.class);

        Map<String, TaskOrdered> taskBeans = context.getBeansOfType(TaskOrdered.class);
        List<TaskOrdered> tasks = taskBeans.values().stream().toList();

        tasks.forEach(TaskOrdered::execute);

    }
}
