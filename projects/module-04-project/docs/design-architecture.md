# ADR 0001: Task Tracker Facade and Package Encapsulation

## Context
We need to build a CLI Task Tracker subsystem that exposes a clean public API facade while keeping domain entities, services, and repository storage package-private.

## Decision
We expose a single public entry point `TaskTrackerFacade` under `handbook.phase00.project04.api`. All internal classes (`TaskService`, `InMemoryTaskRepository`, `TaskItem`) remain package-private under `handbook.phase00.project04.internal`.

## Consequence
Downstream callers interact strictly through `TaskTrackerFacade`, preventing illegal cross-package coupling to internal storage mechanisms.
