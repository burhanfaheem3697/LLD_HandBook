# 00_BOOK_SPEC

Version: `MASTER_CURRICULUM_SPEC_v3.0.0`  
Primary language: Java  
Primary goal: transform a motivated beginner into an engineer capable of designing, reading, extending, and reviewing production-grade software systems.

## Educational Philosophy

This handbook is not an interview roadmap, a list of links, or a pattern catalog. It is a mastery program for software design and low-level design.

The teaching model is spiral learning:

1. Introduce the concept in the smallest useful form.
2. Apply it in Java code.
3. Revisit it inside object-oriented design.
4. Revisit it inside patterns and refactoring.
5. Revisit it inside frameworks such as Spring, Hibernate, Netty, Tomcat, Kafka, Redis, Jackson, Guava, JUnit, Mockito, and OkHttp.
6. Revisit it as a production architecture trade-off.
7. Revisit it while reading mature open-source code.
8. Revisit it while designing a reusable framework.

The learner progresses through these stages:

`Programmer -> Object-Oriented Programmer -> Software Developer -> Software Designer -> Software Architect -> Framework Engineer -> Systems Engineer -> Open Source Contributor -> Master Software Engineer`

## Curriculum Architecture

The handbook contains:

- 18 phases
- 36 parts
- 72 modules
- 216 lessons
- 2,160 estimated study hours
- 28 portfolio projects
- 216 labs
- 18 phase assessment suites
- 1 final integrated engineering ecosystem

Hierarchy rule:

- Every lesson belongs to exactly one module.
- Every module belongs to exactly one part.
- Every part belongs to exactly one phase.
- Every phase ends with an assessment suite.
- Every major phase contributes at least one portfolio artifact.

## Document Structure

The first two documents are canonical:

- `00_BOOK_SPEC.md` defines philosophy, standards, dependency graph rules, formatting, assessment, and project philosophy.
- `01_CURRICULUM_OVERVIEW.md` defines the complete curriculum architecture before detailed phase content.

Phase documents use this naming scheme:

- `02_PHASE_00_PROGRAMMING_PREREQUISITES.md`
- `03_PHASE_01_OBJECT_ORIENTED_FOUNDATIONS.md`
- ...
- `19_PHASE_17_CAPSTONE_ENGINEERING_PROJECTS.md`

Supporting documents:

- `20_PROJECT_PORTFOLIO.md`
- `21_ASSESSMENT_SYSTEM.md`

## Lesson Contract

Every lesson in this handbook is governed by this contract. Phase files may use compact lesson cards, but each lesson must be taught and expanded using all sections below.

### Required Lesson Sections

- Learning Objectives
- Prerequisites
- Knowledge Dependency Graph
- Estimated Study Time
- Difficulty Level
- Expected Learning Outcomes using `I can...` statements
- Video Lectures
- Books
- Exact Chapters
- Sections
- Pages, where stable page references exist
- Technical Blogs
- Official Documentation
- RFCs, where applicable
- Research Papers, where applicable
- Hands-on Labs
- Diagram Exercises
- Machine Coding Exercises
- Reflection Questions
- Design Trade-offs
- Common Mistakes
- Senior Engineering Insights
- Historical Context
- Mini Quiz
- Mini Project, where appropriate
- Further Reading

## Knowledge Dependency Graph Rules

Every lesson specifies:

- `Prerequisites`: knowledge expected before starting.
- `Depends On`: exact concepts the lesson directly builds on.
- `Unlocks`: lessons or capabilities made possible next.
- `Future Applications`: later places where the idea returns.

Example:

```text
Lesson: Strategy Pattern
Prerequisites: interfaces, polymorphism, composition
Depends On: dynamic dispatch, dependency inversion, encapsulated variation
Unlocks: State Pattern, Dependency Injection, Spring Bean Strategies
Future Applications: payment routing, retry policies, serialization strategies, rule engines
```

## Daily Study Loop

Every lesson ends with this loop:

`Watch Lecture -> Read Book -> Take Notes -> Implement Examples -> Practice Exercises -> Complete Lab -> Draw UML/Mermaid Diagram -> Review Mistakes -> Journal Key Insights -> Weekly Revision -> Monthly Revision -> Quarterly Spiral Revision`

## Reference Standards

Use Java for examples unless a concept is language-independent.

When JVM-specific ideas appear, label them explicitly:

- Language-independent concept: applies broadly across languages and runtimes.
- Java concept: applies to Java language semantics.
- JVM concept: applies to bytecode, class loading, garbage collection, JIT, memory model, or runtime internals.
- Framework concept: applies to a specific ecosystem tool such as Spring, Hibernate, Netty, or Kafka.

Stable core references:

- Bloch, `Effective Java`, 3rd edition.
- Gamma, Helm, Johnson, Vlissides, `Design Patterns`.
- Martin Fowler, `Refactoring`, 2nd edition.
- Martin Fowler, `Patterns of Enterprise Application Architecture`.
- Evans, `Domain-Driven Design`.
- Vernon, `Implementing Domain-Driven Design`.
- Goetz et al., `Java Concurrency in Practice`.
- Kleppmann, `Designing Data-Intensive Applications`.
- Hohpe and Woolf, `Enterprise Integration Patterns`.
- Richardson, `Microservices Patterns`.
- Hunt and Thomas, `The Pragmatic Programmer`.
- Feathers, `Working Effectively with Legacy Code`.
- OpenJDK, Spring, Hibernate, Netty, Tomcat, Kafka, Redis, Jackson, Guava, JUnit, Mockito, and OkHttp official documentation.
- RFC 7230-7235 or successor HTTP specifications, RFC 7540 for HTTP/2, RFC 8259 for JSON, RFC 9110-9114 for modern HTTP semantics.

Page numbers vary by edition and format. When teaching from print books, instructors should pin page ranges to the edition used by their cohort.

## Assessment Philosophy

Every phase includes:

- Knowledge Quiz
- Machine Coding
- Code Review
- Architecture Review
- Refactoring Exercise
- Design Review
- Portfolio Review
- Self Evaluation
- Mastery Checklist

Assessment emphasizes judgment, not memorization. A correct solution must explain trade-offs, failure modes, testing strategy, and extension points.

## Project Philosophy

Projects grow in four dimensions:

- Behavioral complexity
- Object model complexity
- Infrastructure complexity
- Operational complexity

Every major project specifies:

- Repository Structure
- README Template
- Architecture Documentation
- UML Diagrams
- API Documentation
- Testing Strategy
- CI/CD Suggestions
- Code Review Checklist
- Common Discussion Points

## Formatting Conventions

Lesson IDs use:

`P{phase}.M{module}.L{lesson}`

Example:

`P05.M02.L03` means Phase 5, Module 2, Lesson 3.

Difficulty levels:

- `L1`: beginner
- `L2`: early intermediate
- `L3`: intermediate
- `L4`: advanced
- `L5`: staff/principal level

