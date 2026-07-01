# 01_CURRICULUM_OVERVIEW

This document defines the complete curriculum architecture before phase-specific content.

## Global Counts

| Item | Count |
|---|---:|
| Phases | 18 |
| Parts | 36 |
| Modules | 72 |
| Lessons | 216 |
| Labs | 216 |
| Phase assessment suites | 18 |
| Portfolio projects | 28 |
| Estimated study hours | 2,160 |

## Duration Estimates

| Pace | Estimated Duration |
|---|---:|
| 10 hrs/week | 216 weeks, about 4.2 years |
| 20 hrs/week | 108 weeks, about 2.1 years |
| 30 hrs/week | 72 weeks, about 1.4 years |
| 40 hrs/week | 54 weeks, about 1 year |

## Phase Architecture

| Phase | Title | Hours | Projects | Labs | Assessments |
|---:|---|---:|---:|---:|---:|
| 0 | Programming Prerequisites | 80 | 1 | 12 | 1 |
| 1 | Object-Oriented Foundations | 100 | 2 | 12 | 1 |
| 2 | Object-Oriented Analysis & Design | 110 | 2 | 12 | 1 |
| 3 | Software Design Principles | 110 | 1 | 12 | 1 |
| 4 | Refactoring & Code Smells | 110 | 1 | 12 | 1 |
| 5 | Design Patterns | 150 | 4 | 12 | 1 |
| 6 | Software Architecture | 130 | 2 | 12 | 1 |
| 7 | Framework & Library Design | 130 | 3 | 12 | 1 |
| 8 | JVM & Systems Foundations | 120 | 1 | 12 | 1 |
| 9 | Networking & Concurrency | 140 | 3 | 12 | 1 |
| 10 | Persistence & Data Access | 130 | 3 | 12 | 1 |
| 11 | Distributed Systems Foundations | 140 | 2 | 12 | 1 |
| 12 | Event-Driven Systems | 120 | 2 | 12 | 1 |
| 13 | Production Engineering | 120 | 1 | 12 | 1 |
| 14 | Reading Open Source | 120 | 1 | 12 | 1 |
| 15 | Framework Engineering | 180 | 4 | 12 | 1 |
| 16 | Architecture Mastery | 140 | 1 | 12 | 1 |
| 17 | Capstone Engineering Projects | 160 | 1 | 12 | 1 |

## Phase, Part, Module, Lesson Map

Each phase has two parts. Each part has two modules. Each module has three lessons.

### Phase 0: Programming Prerequisites

- Part A: Java Programming Core
  - Module 0.1: Syntax, Control Flow, and Data
    - `P00.M01.L01`: Java program structure and execution
    - `P00.M01.L02`: Variables, types, operators, and control flow
    - `P00.M01.L03`: Arrays, strings, collections, and iteration
  - Module 0.2: Functions, Errors, and Testing
    - `P00.M02.L01`: Methods, parameters, return values, and scope
    - `P00.M02.L02`: Exceptions, error handling, and defensive checks
    - `P00.M02.L03`: JUnit basics and executable examples
- Part B: Code as a Changeable Artifact
  - Module 0.3: Git, Build Tools, and Project Structure
    - `P00.M03.L01`: Git workflow and code history
    - `P00.M03.L02`: Maven/Gradle project layout
    - `P00.M03.L03`: Packages, modules, visibility, and naming
  - Module 0.4: Reading and Debugging Code
    - `P00.M04.L01`: Debugging with breakpoints and watches
    - `P00.M04.L02`: Reading unfamiliar Java code
    - `P00.M04.L03`: Small design kata: CLI task tracker

### Phase 1: Object-Oriented Foundations

- Part A: Modeling with Objects
  - Module 1.1: Classes and Encapsulation
    - `P01.M01.L01`: Classes, objects, identity, and state
    - `P01.M01.L02`: Encapsulation, invariants, and access control
    - `P01.M01.L03`: Value objects, entities, and records
  - Module 1.2: Collaboration
    - `P01.M02.L01`: Message passing and method dispatch
    - `P01.M02.L02`: Composition and delegation
    - `P01.M02.L03`: Polymorphism and interfaces
- Part B: Object Models That Survive Change
  - Module 1.3: Inheritance and Substitution
    - `P01.M03.L01`: Inheritance mechanics
    - `P01.M03.L02`: Liskov substitution as behavior
    - `P01.M03.L03`: Composition versus inheritance
  - Module 1.4: Object Testing
    - `P01.M04.L01`: Unit testing object behavior
    - `P01.M04.L02`: Test doubles, fakes, and Mockito basics
    - `P01.M04.L03`: Project: Parking Lot

### Phase 2: Object-Oriented Analysis & Design

- Part A: Discovering the Domain
  - Module 2.1: Requirements to Objects
    - `P02.M01.L01`: Use cases, scenarios, and actors
    - `P02.M01.L02`: Nouns, verbs, responsibilities, and CRC cards
    - `P02.M01.L03`: Boundaries, policies, and rules
  - Module 2.2: Visual Modeling
    - `P02.M02.L01`: UML class and sequence diagrams
    - `P02.M02.L02`: Mermaid and PlantUML for design communication
    - `P02.M02.L03`: State diagrams and activity diagrams
- Part B: From Analysis to Design
  - Module 2.3: Responsibility Assignment
    - `P02.M03.L01`: GRASP information expert and creator
    - `P02.M03.L02`: Controller, low coupling, and high cohesion
    - `P02.M03.L03`: Protected variations and indirection
  - Module 2.4: Domain Modeling Projects
    - `P02.M04.L01`: Project: Chess
    - `P02.M04.L02`: Project: ATM
    - `P02.M04.L03`: Project design reviews

### Phase 3: Software Design Principles

- Part A: Local Design Principles
  - Module 3.1: SOLID
    - `P03.M01.L01`: Single Responsibility and Open/Closed
    - `P03.M01.L02`: Liskov and Interface Segregation
    - `P03.M01.L03`: Dependency Inversion and stable abstractions
  - Module 3.2: Simplicity and Duplication
    - `P03.M02.L01`: DRY and knowledge duplication
    - `P03.M02.L02`: KISS, YAGNI, and speculative generality
    - `P03.M02.L03`: Tell Don't Ask and Law of Demeter
- Part B: Contracts and Boundaries
  - Module 3.3: Design by Contract
    - `P03.M03.L01`: Preconditions, postconditions, and invariants
    - `P03.M03.L02`: Nullability, validation, and failure contracts
    - `P03.M03.L03`: API compatibility and semantic versioning
  - Module 3.4: Principle Trade-offs
    - `P03.M04.L01`: Coupling and cohesion metrics
    - `P03.M04.L02`: Intentional rule violations
    - `P03.M04.L03`: Project: Splitwise core model

### Phase 4: Refactoring & Code Smells

- Part A: Changing Code Safely
  - Module 4.1: Refactoring Mechanics
    - `P04.M01.L01`: Characterization tests
    - `P04.M01.L02`: Extract, move, inline, and rename
    - `P04.M01.L03`: Branch by abstraction
  - Module 4.2: Smell Diagnosis
    - `P04.M02.L01`: Long method, large class, primitive obsession
    - `P04.M02.L02`: Feature envy, data clumps, shotgun surgery
    - `P04.M02.L03`: Temporal coupling and hidden dependencies
- Part B: Legacy Design Recovery
  - Module 4.3: Working with Legacy Code
    - `P04.M03.L01`: Seams and dependency breaking
    - `P04.M03.L02`: Approval testing and golden masters
    - `P04.M03.L03`: Refactoring toward patterns
  - Module 4.4: Review Culture
    - `P04.M04.L01`: Code review as design feedback
    - `P04.M04.L02`: Refactoring plans and risk control
    - `P04.M04.L03`: Project: BookMyShow refactor

### Phase 5: Design Patterns

- Part A: GoF Patterns
  - Module 5.1: Creational Patterns
    - `P05.M01.L01`: Factory Method and Abstract Factory
    - `P05.M01.L02`: Builder and Prototype
    - `P05.M01.L03`: Singleton, lifecycle, and testability
  - Module 5.2: Structural Patterns
    - `P05.M02.L01`: Adapter, Facade, and Proxy
    - `P05.M02.L02`: Decorator, Composite, and Bridge
    - `P05.M02.L03`: Flyweight and object sharing
- Part B: Behavioral and Enterprise Patterns
  - Module 5.3: Behavioral Patterns
    - `P05.M03.L01`: Strategy, State, and Template Method
    - `P05.M03.L02`: Observer, Mediator, and Command
    - `P05.M03.L03`: Iterator, Visitor, Chain, and Memento
  - Module 5.4: Enterprise Patterns
    - `P05.M04.L01`: Repository, Unit of Work, Data Mapper
    - `P05.M04.L02`: Service Layer, Transaction Script, Domain Model
    - `P05.M04.L03`: Projects: Food Delivery and Ride Sharing

### Phase 6: Software Architecture

- Part A: Architectural Styles
  - Module 6.1: Layering and Ports
    - `P06.M01.L01`: Layered architecture
    - `P06.M01.L02`: Hexagonal, Onion, and Clean Architecture
    - `P06.M01.L03`: Dependency direction and boundary enforcement
  - Module 6.2: Distributed Application Shapes
    - `P06.M02.L01`: Modular monoliths
    - `P06.M02.L02`: Microservices
    - `P06.M02.L03`: API gateway and backend-for-frontend
- Part B: Specialized Architectures
  - Module 6.3: Extensible Systems
    - `P06.M03.L01`: Microkernel and plugin architecture
    - `P06.M03.L02`: Pipe and filter
    - `P06.M03.L03`: Workflow and rule engines
  - Module 6.4: Architecture Practice
    - `P06.M04.L01`: ADRs and architecture reviews
    - `P06.M04.L02`: Fitness functions
    - `P06.M04.L03`: Project: Food Delivery architecture

### Phase 7: Framework & Library Design

- Part A: Public API Design
  - Module 7.1: API Ergonomics
    - `P07.M01.L01`: Fluent APIs and builders
    - `P07.M01.L02`: Configuration APIs
    - `P07.M01.L03`: Binary, source, and behavior compatibility
  - Module 7.2: Extension Points
    - `P07.M02.L01`: SPIs and plugin points
    - `P07.M02.L02`: Callbacks, hooks, listeners
    - `P07.M02.L03`: Error models and diagnostics
- Part B: Framework Internals
  - Module 7.3: Inversion of Control
    - `P07.M03.L01`: DI and IoC containers
    - `P07.M03.L02`: Reflection and annotations
    - `P07.M03.L03`: Annotation processing basics
  - Module 7.4: Library Projects
    - `P07.M04.L01`: Project: Logging framework
    - `P07.M04.L02`: Project: Configuration framework
    - `P07.M04.L03`: Project: Plugin framework

### Phase 8: JVM & Systems Foundations

- Part A: JVM Runtime
  - Module 8.1: Bytecode and Class Loading
    - `P08.M01.L01`: Bytecode basics
    - `P08.M01.L02`: Class loading and classpath/module path
    - `P08.M01.L03`: Reflection cost and safety
  - Module 8.2: Memory and Execution
    - `P08.M02.L01`: Stack, heap, metaspace
    - `P08.M02.L02`: Garbage collection fundamentals
    - `P08.M02.L03`: JIT, profiling, and warmup
- Part B: Systems View
  - Module 8.3: OS and Process Basics
    - `P08.M03.L01`: Processes, threads, file descriptors
    - `P08.M03.L02`: System calls and blocking I/O
    - `P08.M03.L03`: Memory locality and caches
  - Module 8.4: JVM Diagnostics
    - `P08.M04.L01`: jcmd, jstack, jmap, JFR
    - `P08.M04.L02`: Heap dumps and thread dumps
    - `P08.M04.L03`: Project: JVM diagnostics lab

### Phase 9: Networking & Concurrency

- Part A: Concurrency
  - Module 9.1: Java Concurrency
    - `P09.M01.L01`: Threads, executors, and thread pools
    - `P09.M01.L02`: Locks, conditions, atomics, and CAS
    - `P09.M01.L03`: Java Memory Model
  - Module 9.2: Concurrent Design
    - `P09.M02.L01`: Immutability and confinement
    - `P09.M02.L02`: Queues, backpressure, and scheduling
    - `P09.M02.L03`: Lock-free structure basics
- Part B: Networking
  - Module 9.3: Protocol Foundations
    - `P09.M03.L01`: Sockets and TCP
    - `P09.M03.L02`: HTTP/1.1 and HTTP/2
    - `P09.M03.L03`: Serialization and framing
  - Module 9.4: Reactive and Server Design
    - `P09.M04.L01`: Blocking versus non-blocking I/O
    - `P09.M04.L02`: Reactor pattern and Netty
    - `P09.M04.L03`: Projects: Mini Tomcat and Mini Netty

### Phase 10: Persistence & Data Access

- Part A: Relational Persistence
  - Module 10.1: SQL and Transactions
    - `P10.M01.L01`: Schema design and constraints
    - `P10.M01.L02`: ACID and isolation
    - `P10.M01.L03`: Optimistic and pessimistic locking
  - Module 10.2: ORM Design
    - `P10.M02.L01`: Identity map and unit of work
    - `P10.M02.L02`: Lazy loading and proxies
    - `P10.M02.L03`: Mapping inheritance and aggregates
- Part B: Caching and Data Access Frameworks
  - Module 10.3: Caching
    - `P10.M03.L01`: Cache-aside and write-through
    - `P10.M03.L02`: Eviction, TTL, and consistency
    - `P10.M03.L03`: Redis design basics
  - Module 10.4: Persistence Projects
    - `P10.M04.L01`: Project: Connection Pool
    - `P10.M04.L02`: Project: ORM
    - `P10.M04.L03`: Project: Mini Hibernate

### Phase 11: Distributed Systems Foundations

- Part A: Distributed Reality
  - Module 11.1: Failure and Time
    - `P11.M01.L01`: Partial failure and timeouts
    - `P11.M01.L02`: Retries, idempotency, and deduplication
    - `P11.M01.L03`: Clocks and ordering
  - Module 11.2: Data Distribution
    - `P11.M02.L01`: Replication
    - `P11.M02.L02`: Partitioning and sharding
    - `P11.M02.L03`: CAP and consistency models
- Part B: Coordination
  - Module 11.3: Consensus Basics
    - `P11.M03.L01`: Leader election
    - `P11.M03.L02`: Quorums
    - `P11.M03.L03`: Raft concepts
  - Module 11.4: Distributed Design
    - `P11.M04.L01`: Service discovery
    - `P11.M04.L02`: API evolution in distributed systems
    - `P11.M04.L03`: Project: Mini Redis

### Phase 12: Event-Driven Systems

- Part A: Messaging
  - Module 12.1: Event Fundamentals
    - `P12.M01.L01`: Events, commands, and messages
    - `P12.M01.L02`: Brokers, queues, topics
    - `P12.M01.L03`: Delivery guarantees
  - Module 12.2: Integration Patterns
    - `P12.M02.L01`: Pub/sub and competing consumers
    - `P12.M02.L02`: Saga and process manager
    - `P12.M02.L03`: Outbox and inbox
- Part B: Event-Sourced Design
  - Module 12.3: CQRS and Event Sourcing
    - `P12.M03.L01`: CQRS read/write models
    - `P12.M03.L02`: Event sourcing mechanics
    - `P12.M03.L03`: Snapshots and projections
  - Module 12.4: Streaming Project
    - `P12.M04.L01`: Kafka architecture reading
    - `P12.M04.L02`: Project: Mini Kafka
    - `P12.M04.L03`: Event-driven review

### Phase 13: Production Engineering

- Part A: Operability
  - Module 13.1: Observability
    - `P13.M01.L01`: Logging design
    - `P13.M01.L02`: Metrics and SLIs
    - `P13.M01.L03`: Tracing and context propagation
  - Module 13.2: Reliability
    - `P13.M02.L01`: Circuit breakers and bulkheads
    - `P13.M02.L02`: Rate limiting and load shedding
    - `P13.M02.L03`: Graceful degradation
- Part B: Engineering for Production
  - Module 13.3: Performance and Security
    - `P13.M03.L01`: Profiling and benchmarking
    - `P13.M03.L02`: Threat modeling
    - `P13.M03.L03`: Security by design
  - Module 13.4: Delivery
    - `P13.M04.L01`: CI/CD design
    - `P13.M04.L02`: Feature flags
    - `P13.M04.L03`: Project: Feature Flag System

### Phase 14: Reading Open Source

- Part A: Reading Method
  - Module 14.1: Codebase Navigation
    - `P14.M01.L01`: Build, run, test, and debug first
    - `P14.M01.L02`: Package structure and entry points
    - `P14.M01.L03`: Dependency graphs and call paths
  - Module 14.2: Design Recovery
    - `P14.M02.L01`: Key interfaces and extension points
    - `P14.M02.L02`: Control flow tracing
    - `P14.M02.L03`: Classes to ignore initially
- Part B: Ecosystem Reading
  - Module 14.3: Framework Case Studies
    - `P14.M03.L01`: Spring Framework and Spring Boot
    - `P14.M03.L02`: Hibernate and Jackson
    - `P14.M03.L03`: JUnit, Mockito, Guava, OkHttp
  - Module 14.4: Systems Case Studies
    - `P14.M04.L01`: Tomcat and Netty
    - `P14.M04.L02`: Kafka and Redis
    - `P14.M04.L03`: Open-source contribution project

### Phase 15: Framework Engineering

- Part A: Rebuilding Core Frameworks
  - Module 15.1: Mini Spring
    - `P15.M01.L01`: Bean definitions and dependency graph
    - `P15.M01.L02`: Lifecycle, scopes, and post-processors
    - `P15.M01.L03`: AOP proxy basics
  - Module 15.2: REST Framework
    - `P15.M02.L01`: Routing and handler mapping
    - `P15.M02.L02`: Serialization and validation
    - `P15.M02.L03`: Filters, interceptors, and error handling
- Part B: Platform Frameworks
  - Module 15.3: Workflow, Rule, and Scheduler Engines
    - `P15.M03.L01`: Workflow engine design
    - `P15.M03.L02`: Rule engine design
    - `P15.M03.L03`: Scheduler design
  - Module 15.4: Developer Platform
    - `P15.M04.L01`: API gateway design
    - `P15.M04.L02`: Configuration and plugin runtime
    - `P15.M04.L03`: Framework compatibility review

### Phase 16: Architecture Mastery

- Part A: Architectural Judgment
  - Module 16.1: Trade-off Analysis
    - `P16.M01.L01`: Quality attribute scenarios
    - `P16.M01.L02`: Architecture risk analysis
    - `P16.M01.L03`: Cost of reversibility
  - Module 16.2: Organizational Design
    - `P16.M02.L01`: Team boundaries and Conway's Law
    - `P16.M02.L02`: Platform versus product architecture
    - `P16.M02.L03`: Governance without stagnation
- Part B: Master Reviews
  - Module 16.3: Architecture Review Boards
    - `P16.M03.L01`: Review preparation
    - `P16.M03.L02`: Decision records and alternatives
    - `P16.M03.L03`: Failure-mode reviews
  - Module 16.4: Evolution
    - `P16.M04.L01`: Legacy modernization
    - `P16.M04.L02`: Migration strategy
    - `P16.M04.L03`: Portfolio architecture review

### Phase 17: Capstone Engineering Projects

- Part A: Integrated Ecosystem
  - Module 17.1: Platform Definition
    - `P17.M01.L01`: System vision and bounded contexts
    - `P17.M01.L02`: Cross-cutting framework selection
    - `P17.M01.L03`: Architecture runway
  - Module 17.2: Implementation
    - `P17.M02.L01`: Build the integrated platform
    - `P17.M02.L02`: Test architecture and production readiness
    - `P17.M02.L03`: Operability and security hardening
- Part B: Publication and Contribution
  - Module 17.3: Professionalization
    - `P17.M03.L01`: Documentation and tutorials
    - `P17.M03.L02`: Open-source readiness
    - `P17.M03.L03`: Release engineering
  - Module 17.4: Final Defense
    - `P17.M04.L01`: Architecture defense
    - `P17.M04.L02`: Code review defense
    - `P17.M04.L03`: Mastery retrospective

## Common Lesson Resource Pattern

Each phase document assigns concrete readings and exercises. Unless overridden, use:

- Video: MIT 6.005/6.031, Stanford CS course lectures, CMU software engineering lectures, Java ecosystem conference talks, and official project talks.
- Books: the stable references listed in `00_BOOK_SPEC.md`.
- Documentation: official Java, OpenJDK, Spring, Hibernate, Netty, Tomcat, Kafka, Redis, Jackson, Guava, JUnit, Mockito, and OkHttp docs.
- Papers/RFCs: assigned only when they naturally fit the topic.

## Global Dependency Spine

`Java basics -> object modeling -> object collaboration -> responsibility assignment -> design principles -> refactoring -> patterns -> architecture -> APIs/frameworks -> JVM/systems -> concurrency/networking -> persistence -> distributed systems -> event-driven systems -> production engineering -> open-source reading -> framework engineering -> architecture mastery -> capstone`

