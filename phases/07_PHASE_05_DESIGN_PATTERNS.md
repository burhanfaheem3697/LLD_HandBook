# Phase 5: Design Patterns

Hours: 150  
Projects: Food Delivery, Ride Sharing, Workflow Engine slice, Rule Engine slice

## Lesson Dependency Graph

| Lesson | Focus | Depends On | Unlocks | Future Applications |
|---|---|---|---|---|
| P05.M01.L01 | Factory Method, Abstract Factory | polymorphism | object creation boundaries | Spring factories |
| P05.M01.L02 | Builder, Prototype | P05.M01.L01 | fluent construction | API clients |
| P05.M01.L03 | Singleton and lifecycle | P05.M01.L02 | lifecycle critique | DI containers |
| P05.M02.L01 | Adapter, Facade, Proxy | Phase 4 | compatibility wrappers | Hibernate proxies |
| P05.M02.L02 | Decorator, Composite, Bridge | P05.M02.L01 | structural flexibility | servlet filters |
| P05.M02.L03 | Flyweight | P05.M02.L02 | memory sharing | caches |
| P05.M03.L01 | Strategy, State, Template Method | SOLID | behavior variation | workflow engines |
| P05.M03.L02 | Observer, Mediator, Command | P05.M03.L01 | event collaboration | domain events |
| P05.M03.L03 | Iterator, Visitor, Chain, Memento | P05.M03.L02 | traversal and pipelines | compilers, interceptors |
| P05.M04.L01 | Repository, Unit of Work, Data Mapper | enterprise design | persistence layer | ORM |
| P05.M04.L02 | Service Layer, Transaction Script, Domain Model | P05.M04.L01 | app architecture | DDD |
| P05.M04.L03 | Food Delivery/Ride Sharing | P05.M04.L02 | applied patterns | microservices |

## Required Resources

- Books: GoF `Design Patterns`; Fowler `Patterns of Enterprise Application Architecture`; Hohpe/Woolf `Enterprise Integration Patterns` as preview.
- Labs: implement every GoF pattern in Java, then remove any pattern that does not solve a real variation point.
- Common mistakes: pattern worship, singleton misuse, factories without meaningful creation policy, anemic domain services.

## Assessment

Build Food Delivery and Ride Sharing design slices. Each pattern use must include a before/after explanation and an explicit rejection of at least two unnecessary patterns.


## Guided Self-Study Program

This section upgrades the phase from syllabus to workbook. It does not change phase order, module order, lesson order, project order, dependencies, outcomes, or philosophy. It expands each existing lesson into a concrete self-study plan.

### Phase Study Rhythm

- Study one lesson at a time.
- Do not begin the next lesson until the checklist for the current lesson is complete.
- Keep one Git repository for the phase and one folder per lesson.
- Commit after each day with a message that names the lesson ID.
- Maintain a learning-journal.md with definitions, mistakes, diagrams, and senior-engineering observations.

### P05.M01.L01 Guided Study: Factory Method and Abstract Factory

#### Lesson Overview

- Learning objectives: explain Factory Method and Abstract Factory precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: all prior phases and the phase prerequisites listed above.
- Knowledge dependency graph: $(@{Id=P05.M01.L01; Title=Factory Method and Abstract Factory}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Factory Method and Abstract Factory".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Factory Method and Abstract Factory".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m01l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Factory Method and Abstract Factory".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M01.L01; Title=Factory Method and Abstract Factory}.Id):

- Input: a tiny but realistic scenario involving "Factory Method and Abstract Factory".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Factory Method and Abstract Factory" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m01l01/
src/test/java/handbook/phase05/p05m01l01/
docs/P05.M01.L01-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P05.M01.L02 Guided Study: Builder and Prototype

#### Lesson Overview

- Learning objectives: explain Builder and Prototype precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M01.L02; Title=Builder and Prototype}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Builder and Prototype".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Builder and Prototype".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m01l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Builder and Prototype".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M01.L02; Title=Builder and Prototype}.Id):

- Input: a tiny but realistic scenario involving "Builder and Prototype".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Builder and Prototype" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m01l02/
src/test/java/handbook/phase05/p05m01l02/
docs/P05.M01.L02-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P05.M01.L03 Guided Study: Singleton, lifecycle, and testability

#### Lesson Overview

- Learning objectives: explain Singleton, lifecycle, and testability precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M01.L03; Title=Singleton, lifecycle, and testability}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Singleton, lifecycle, and testability".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Singleton, lifecycle, and testability".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m01l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Singleton, lifecycle, and testability".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M01.L03; Title=Singleton, lifecycle, and testability}.Id):

- Input: a tiny but realistic scenario involving "Singleton, lifecycle, and testability".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Singleton, lifecycle, and testability" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m01l03/
src/test/java/handbook/phase05/p05m01l03/
docs/P05.M01.L03-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### Module 05.01 Project

- Scope: integrate the module lessons: Factory Method and Abstract Factory; Builder and Prototype; Singleton, lifecycle, and testability.
- Functional requirements: expose one complete user-facing or developer-facing workflow that proves the three concepts work together.
- Non-functional requirements: readable Java API, deterministic tests, clear errors, simple package structure, and documented limitations.
- Suggested folder structure:

`	ext
module-project/
  README.md
  docs/architecture.md
  docs/adr/0001-design.md
  docs/diagrams/module-flow.md
  src/main/java/
  src/test/java/
`

- Milestones: requirements note; object model; first test; implementation; refactor; diagram; review.
- Deliverables: source code, tests, README, architecture note, UML/Mermaid diagrams, and one design review checklist.
- Testing requirements: unit tests for each concept, collaboration tests across concepts, and one regression test for a likely mistake.
- Documentation requirements: explain how the module project uses design patterns and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

### P05.M02.L01 Guided Study: Adapter, Facade, and Proxy

#### Lesson Overview

- Learning objectives: explain Adapter, Facade, and Proxy precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M02.L01; Title=Adapter, Facade, and Proxy}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Adapter, Facade, and Proxy".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Adapter, Facade, and Proxy".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m02l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Adapter, Facade, and Proxy".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M02.L01; Title=Adapter, Facade, and Proxy}.Id):

- Input: a tiny but realistic scenario involving "Adapter, Facade, and Proxy".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Adapter, Facade, and Proxy" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m02l01/
src/test/java/handbook/phase05/p05m02l01/
docs/P05.M02.L01-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P05.M02.L02 Guided Study: Decorator, Composite, and Bridge

#### Lesson Overview

- Learning objectives: explain Decorator, Composite, and Bridge precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M02.L02; Title=Decorator, Composite, and Bridge}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Decorator, Composite, and Bridge".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Decorator, Composite, and Bridge".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m02l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Decorator, Composite, and Bridge".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M02.L02; Title=Decorator, Composite, and Bridge}.Id):

- Input: a tiny but realistic scenario involving "Decorator, Composite, and Bridge".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Decorator, Composite, and Bridge" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m02l02/
src/test/java/handbook/phase05/p05m02l02/
docs/P05.M02.L02-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P05.M02.L03 Guided Study: Flyweight and object sharing

#### Lesson Overview

- Learning objectives: explain Flyweight and object sharing precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M02.L03; Title=Flyweight and object sharing}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Flyweight and object sharing".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Flyweight and object sharing".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m02l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Flyweight and object sharing".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M02.L03; Title=Flyweight and object sharing}.Id):

- Input: a tiny but realistic scenario involving "Flyweight and object sharing".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Flyweight and object sharing" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m02l03/
src/test/java/handbook/phase05/p05m02l03/
docs/P05.M02.L03-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### Module 05.02 Project

- Scope: integrate the module lessons: Adapter, Facade, and Proxy; Decorator, Composite, and Bridge; Flyweight and object sharing.
- Functional requirements: expose one complete user-facing or developer-facing workflow that proves the three concepts work together.
- Non-functional requirements: readable Java API, deterministic tests, clear errors, simple package structure, and documented limitations.
- Suggested folder structure:

`	ext
module-project/
  README.md
  docs/architecture.md
  docs/adr/0001-design.md
  docs/diagrams/module-flow.md
  src/main/java/
  src/test/java/
`

- Milestones: requirements note; object model; first test; implementation; refactor; diagram; review.
- Deliverables: source code, tests, README, architecture note, UML/Mermaid diagrams, and one design review checklist.
- Testing requirements: unit tests for each concept, collaboration tests across concepts, and one regression test for a likely mistake.
- Documentation requirements: explain how the module project uses design patterns and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

### P05.M03.L01 Guided Study: Strategy, State, and Template Method

#### Lesson Overview

- Learning objectives: explain Strategy, State, and Template Method precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M03.L01; Title=Strategy, State, and Template Method}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Strategy, State, and Template Method".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Strategy, State, and Template Method".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m03l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Strategy, State, and Template Method".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M03.L01; Title=Strategy, State, and Template Method}.Id):

- Input: a tiny but realistic scenario involving "Strategy, State, and Template Method".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Strategy, State, and Template Method" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m03l01/
src/test/java/handbook/phase05/p05m03l01/
docs/P05.M03.L01-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P05.M03.L02 Guided Study: Observer, Mediator, and Command

#### Lesson Overview

- Learning objectives: explain Observer, Mediator, and Command precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M03.L02; Title=Observer, Mediator, and Command}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Observer, Mediator, and Command".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Observer, Mediator, and Command".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m03l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Observer, Mediator, and Command".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M03.L02; Title=Observer, Mediator, and Command}.Id):

- Input: a tiny but realistic scenario involving "Observer, Mediator, and Command".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Observer, Mediator, and Command" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m03l02/
src/test/java/handbook/phase05/p05m03l02/
docs/P05.M03.L02-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P05.M03.L03 Guided Study: Iterator, Visitor, Chain, and Memento

#### Lesson Overview

- Learning objectives: explain Iterator, Visitor, Chain, and Memento precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M03.L03; Title=Iterator, Visitor, Chain, and Memento}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Iterator, Visitor, Chain, and Memento".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Iterator, Visitor, Chain, and Memento".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m03l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Iterator, Visitor, Chain, and Memento".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M03.L03; Title=Iterator, Visitor, Chain, and Memento}.Id):

- Input: a tiny but realistic scenario involving "Iterator, Visitor, Chain, and Memento".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Iterator, Visitor, Chain, and Memento" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m03l03/
src/test/java/handbook/phase05/p05m03l03/
docs/P05.M03.L03-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### Module 05.03 Project

- Scope: integrate the module lessons: Strategy, State, and Template Method; Observer, Mediator, and Command; Iterator, Visitor, Chain, and Memento.
- Functional requirements: expose one complete user-facing or developer-facing workflow that proves the three concepts work together.
- Non-functional requirements: readable Java API, deterministic tests, clear errors, simple package structure, and documented limitations.
- Suggested folder structure:

`	ext
module-project/
  README.md
  docs/architecture.md
  docs/adr/0001-design.md
  docs/diagrams/module-flow.md
  src/main/java/
  src/test/java/
`

- Milestones: requirements note; object model; first test; implementation; refactor; diagram; review.
- Deliverables: source code, tests, README, architecture note, UML/Mermaid diagrams, and one design review checklist.
- Testing requirements: unit tests for each concept, collaboration tests across concepts, and one regression test for a likely mistake.
- Documentation requirements: explain how the module project uses design patterns and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

### P05.M04.L01 Guided Study: Repository, Unit of Work, Data Mapper

#### Lesson Overview

- Learning objectives: explain Repository, Unit of Work, Data Mapper precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M04.L01; Title=Repository, Unit of Work, Data Mapper}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Repository, Unit of Work, Data Mapper".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Repository, Unit of Work, Data Mapper".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m04l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Repository, Unit of Work, Data Mapper".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M04.L01; Title=Repository, Unit of Work, Data Mapper}.Id):

- Input: a tiny but realistic scenario involving "Repository, Unit of Work, Data Mapper".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Repository, Unit of Work, Data Mapper" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m04l01/
src/test/java/handbook/phase05/p05m04l01/
docs/P05.M04.L01-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P05.M04.L02 Guided Study: Service Layer, Transaction Script, Domain Model

#### Lesson Overview

- Learning objectives: explain Service Layer, Transaction Script, Domain Model precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M04.L02; Title=Service Layer, Transaction Script, Domain Model}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Service Layer, Transaction Script, Domain Model".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Service Layer, Transaction Script, Domain Model".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m04l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Service Layer, Transaction Script, Domain Model".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M04.L02; Title=Service Layer, Transaction Script, Domain Model}.Id):

- Input: a tiny but realistic scenario involving "Service Layer, Transaction Script, Domain Model".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Service Layer, Transaction Script, Domain Model" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m04l02/
src/test/java/handbook/phase05/p05m04l02/
docs/P05.M04.L02-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### P05.M04.L03 Guided Study: Projects: Food Delivery and Ride Sharing

#### Lesson Overview

- Learning objectives: explain Projects: Food Delivery and Ride Sharing precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to design patterns.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P05.M04.L03; Title=Projects: Food Delivery and Ride Sharing}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L2-L3.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P05, selecting the lecture whose topic is closest to "Projects: Food Delivery and Ride Sharing".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Design Patterns, Gamma/Helm/Johnson/Vlissides; Patterns of Enterprise Application Architecture, Martin Fowler.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 5; choose the row matching "Projects: Food Delivery and Ride Sharing".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to design patterns until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase05.lessonp05m04l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Projects: Food Delivery and Ride Sharing".
2. Refactor the example once to improve naming, cohesion, and testability.
3. Extend the example with one realistic variation point.
4. Debug one intentionally broken version and document the failure.
5. Benchmark or profile only when the lesson has runtime implications; otherwise perform a code review against the lesson's design forces.

#### Step 5 - UML Exercise

- Draw one class or package diagram to show static structure.
- Draw one sequence diagram to show runtime collaboration.
- Draw an activity or state diagram if the lesson includes workflow, lifecycle, protocol, transaction, or concurrency behavior.
- Why: diagrams force you to separate structure from behavior and reveal hidden dependencies that code can obscure.

#### Step 6 - Machine Coding

Build a small Java exercise named after $(@{Id=P05.M04.L03; Title=Projects: Food Delivery and Ride Sharing}.Id):

- Input: a tiny but realistic scenario involving "Projects: Food Delivery and Ride Sharing".
- Output: working code, tests, README note, and one diagram.
- Constraint: no framework magic unless the lesson is explicitly about frameworks.
- Minimum tests: happy path, invalid input, boundary condition, and one design-regression test.

#### Step 7 - Daily Study Plan

Day 1:
- Watch the primary lecture from the phase video track.
- Take handwritten notes using the headings: problem, vocabulary, example, trade-off, misuse.
- Read the first assigned book section.
- Reimplement the simplest example exactly once.
- Time: 3 hours.

Day 2:
- Finish the assigned reading.
- Reimplement the example without looking.
- Write unit tests before adding the extension.
- Draw the static UML diagram.
- Time: 3 hours.

Day 3:
- Complete the hands-on implementation and machine coding exercise.
- Debug one broken variant.
- Draw the sequence diagram.
- Answer the mini quiz and write a short design note.
- Time: 3 hours.
Day 4:
- Read one technical blog, official doc, RFC, or paper from the lesson reference list.
- Connect the concept to Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Projects: Food Delivery and Ride Sharing" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase05/p05m04l03/
src/test/java/handbook/phase05/p05m04l03/
docs/P05.M04.L03-diagram.md
`

- Acceptance criteria: code compiles, tests pass, README explains the concept, diagrams match code, and a reviewer can identify the main design decision in under five minutes.
- Extensions: add one new requirement without breaking existing tests.
- Stretch goals: add property-style tests, benchmark results, or a second implementation using a different trade-off.
- Evaluation rubric: correctness 30%, design clarity 25%, tests 20%, documentation 15%, trade-off explanation 10%.

#### Step 9 - Module Project Connection

At the end of this module, fold the lesson artifact into the module project:

- Functional requirement: the project must use the lesson concept in one visible feature.
- Non-functional requirement: preserve readability, testability, and explicit failure behavior.
- Suggested folder structure: keep production code under src/main/java, tests under src/test/java, diagrams under docs/diagrams, and ADRs under docs/adr.
- Milestones: model first, tests second, implementation third, review fourth.
- Deliverables: code, tests, README, UML/Mermaid diagram, and one ADR.
- Testing requirements: unit tests plus one integration-style test when collaboration crosses a boundary.
- Documentation requirements: explain purpose, usage, alternatives, and limitations.
- GitHub README expectations: problem statement, how to run, design decisions, test command, and known limitations.
- Evaluation rubric: feature behavior 30%, design fit 30%, test confidence 20%, documentation 20%.

#### Step 10 - Revision Plan

- Daily revision: restate the concept from memory and run the tests.
- Weekly revision: compare your solution against one alternative and update the diagram.
- Monthly revision: revisit the open-source connection and identify the same idea in real code.
- Quarterly revision: rebuild the exercise from scratch with stricter constraints.
- Spiral revision: when this concept reappears in a later phase, add a note explaining what your earlier understanding missed.

#### Step 11 - Common Mistakes

- Beginner mistakes: memorizing the term without implementing it; writing code before naming responsibilities; skipping tests.
- Intermediate mistakes: over-abstracting; hiding simple behavior behind unnecessary interfaces; drawing diagrams that do not match code.
- Professional mistakes: optimizing for current convenience while damaging API stability, operability, or future migration.
- Senior engineers avoid these by stating forces, constraints, alternatives, and failure modes before committing to a design.

#### Step 12 - Design Thinking

- Why invented: to solve a recurring problem in design patterns where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Spring, Hibernate, Tomcat, Netty, Jackson, and JUnit. Record:

- Package or class name.
- Entry point.
- Key interface.
- Extension point.
- Control flow.
- One class to ignore initially.
- One reimplementation task in your own words.

#### Step 14 - Checklist

- [ ] I watched the assigned lecture and captured timestamped notes.
- [ ] I read the assigned book sections and recorded page ranges.
- [ ] I implemented the core example in Java.
- [ ] I solved at least three exercises.
- [ ] I drew the required UML/Mermaid diagrams.
- [ ] I tested happy path, failure path, and boundary behavior.
- [ ] I reviewed mistakes and refactored once.
- [ ] I can explain why this concept exists and when not to use it.
- [ ] I can teach this concept to another engineer.

### Module 05.04 Project

- Scope: integrate the module lessons: Repository, Unit of Work, Data Mapper; Service Layer, Transaction Script, Domain Model; Projects: Food Delivery and Ride Sharing.
- Functional requirements: expose one complete user-facing or developer-facing workflow that proves the three concepts work together.
- Non-functional requirements: readable Java API, deterministic tests, clear errors, simple package structure, and documented limitations.
- Suggested folder structure:

`	ext
module-project/
  README.md
  docs/architecture.md
  docs/adr/0001-design.md
  docs/diagrams/module-flow.md
  src/main/java/
  src/test/java/
`

- Milestones: requirements note; object model; first test; implementation; refactor; diagram; review.
- Deliverables: source code, tests, README, architecture note, UML/Mermaid diagrams, and one design review checklist.
- Testing requirements: unit tests for each concept, collaboration tests across concepts, and one regression test for a likely mistake.
- Documentation requirements: explain how the module project uses design patterns and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

