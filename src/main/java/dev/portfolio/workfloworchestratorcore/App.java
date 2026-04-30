package dev.portfolio.workfloworchestratorcore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record WorkItem(String id, String owner, int priority) {}

final class WorkItemService {
    List<WorkItem> prioritize(List<WorkItem> items) {
        var copy = new ArrayList<>(items);
        copy.sort(Comparator.comparingInt(WorkItem::priority).reversed().thenComparing(WorkItem::id));
        return copy;
    }
}

public class App {
    public static void main(String[] args) {
        var service = new WorkItemService();
        var result = service.prioritize(List.of(new WorkItem("a", "ops", 4), new WorkItem("b", "data", 9)));
        result.forEach(item -> System.out.println(item.id() + ":" + item.priority()));
    }
}
