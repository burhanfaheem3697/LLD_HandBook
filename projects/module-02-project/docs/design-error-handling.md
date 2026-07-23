# ADR 0001: Exception Contracts in Order Processing Subsystem

## Context
We need to handle parameter validation errors (developer bugs) and inventory missing errors (business rule failures) distinctly.

## Decision
We use unchecked `IllegalArgumentException` for parameter guard violations, and a custom checked `InsufficientInventoryException` for recoverable business inventory failures.

## Consequence
Callers are forced by the compiler to handle inventory stockouts, while invalid method parameters fail fast immediately.