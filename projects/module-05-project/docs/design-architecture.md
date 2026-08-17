# ADR 0001: Domain Model Boundaries and Value Object Encapsulation

## Context
We need to design a customer account domain subsystem that manages account balances and addresses without exposing mutable internal collections or primitive parameters to external packages.

## Decision
We model `Address` as a Java 14+ `record`, `Money` as an immutable Value Object, and `CustomerAccount` as an Entity with identity-based `equals/hashCode`. We expose `DomainAccountFacade` as the public entry point.

## Consequence
All collection getters return defensive copies (`List.copyOf()`), protecting internal state against external mutation.
