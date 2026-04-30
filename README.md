# Workflow Orchestrator Core

    Workflow state-machine core with guarded transitions.

    ## Stack

    - Language: Java
    - Difficulty: very high
    - Scope: small, self-contained service/tool with clear extension points

    ## Project layout

    The repository keeps implementation code under `src/` where that is idiomatic, plus a short runnable entry point and a small sample payload when useful.

    ## Run

    ```bash
    javac src/main/java/dev/portfolio/workfloworchestratorcore/App.java
java -cp src/main/java dev.portfolio.workfloworchestratorcore.App
    ```

    ## Engineering notes

    The implementation keeps parsing, domain logic and output formatting separate enough to grow without turning into a script dump. Generated artifacts and dependency folders are intentionally ignored.
