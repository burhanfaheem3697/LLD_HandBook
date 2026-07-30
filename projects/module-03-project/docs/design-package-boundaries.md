# ADR 0001: Package Boundaries and Facade Architecture

## Context
We need to design a pipeline configuration subsystem that loads defaults from classpath resources and executes deployment calculations without exposing internal calculation engines to external packages.

## Decision
We expose a single public facade `PipelineFacade` under `handbook.phase00.project03.api`. All execution engines (`PipelineEngine`) remain package-private under `handbook.phase00.project03.internal`.

## Consequence
External clients interact strictly through the public facade, preventing illegal coupling to internal calculation algorithms.