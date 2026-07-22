# ADR 0001: Design of InMemory Task Registry

## Context
We need to design a task storage subsystem that supports validation, searches, and is safe from external state corruption.

## Decision
We chose Composition over Inheritance by wrapping an internal `ArrayList` instead of extending it. We enforce defensive copying on all list return queries.

## Consequence
Ensures absolute encapsulation; callers cannot corrupt internal database states.