# Phase 9: Networking & Concurrency

Hours: 140  
Projects: Scheduler, Mini Tomcat, Mini Netty

## Lesson Dependency Graph

| Lesson | Focus | Depends On | Unlocks | Future Applications |
|---|---|---|---|---|
| P09.M01.L01 | Threads, executors, pools | JVM | concurrent services | schedulers |
| P09.M01.L02 | Locks, conditions, atomics, CAS | P09.M01.L01 | synchronization | lock-free basics |
| P09.M01.L03 | Java Memory Model | P09.M01.L02 | visibility correctness | high-scale servers |
| P09.M02.L01 | Immutability/confinement | P09.M01.L03 | safe sharing | actors/reactive |
| P09.M02.L02 | Queues/backpressure/scheduling | P09.M02.L01 | load control | Kafka/Netty |
| P09.M02.L03 | Lock-free structures | P09.M02.L02 | advanced concurrency | queues/caches |
| P09.M03.L01 | Sockets and TCP | systems | network servers | Tomcat/Redis |
| P09.M03.L02 | HTTP/1.1 and HTTP/2 | P09.M03.L01 | REST frameworks | API design |
| P09.M03.L03 | Serialization/framing | P09.M03.L02 | protocols | Kafka/Redis |
| P09.M04.L01 | Blocking vs non-blocking I/O | P09.M03.L03 | NIO | Netty |
| P09.M04.L02 | Reactor pattern | P09.M04.L01 | event loops | reactive systems |
| P09.M04.L03 | Mini Tomcat/Netty | P09.M04.L02 | server framework | Phase 15 |

## Required Resources

- Books: `Java Concurrency in Practice`; `Unix Network Programming` selected concepts; Netty in Action.
- RFCs: RFC 9110-9114 for HTTP, RFC 7540 for HTTP/2 where needed.
- Labs: executor tuning, race reproduction, socket server, simple HTTP parser, non-blocking echo server.

## Assessment

Build a scheduler, a minimal servlet-style blocking HTTP server, and a small NIO event-loop server with tests and load notes.


## Guided Self-Study Program

This section upgrades the phase from syllabus to workbook. It does not change phase order, module order, lesson order, project order, dependencies, outcomes, or philosophy. It expands each existing lesson into a concrete self-study plan.

### Phase Study Rhythm

- Study one lesson at a time.
- Do not begin the next lesson until the checklist for the current lesson is complete.
- Keep one Git repository for the phase and one folder per lesson.
- Commit after each day with a message that names the lesson ID.
- Maintain a learning-journal.md with definitions, mistakes, diagrams, and senior-engineering observations.

### P09.M01.L01 Guided Study: Threads, executors, and thread pools

#### Lesson Overview

- Learning objectives: explain Threads, executors, and thread pools precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: all prior phases and the phase prerequisites listed above.
- Knowledge dependency graph: $(@{Id=P09.M01.L01; Title=Threads, executors, and thread pools}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Threads, executors, and thread pools".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Threads, executors, and thread pools".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m01l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Threads, executors, and thread pools".
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

Build a small Java exercise named after $(@{Id=P09.M01.L01; Title=Threads, executors, and thread pools}.Id):

- Input: a tiny but realistic scenario involving "Threads, executors, and thread pools".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Threads, executors, and thread pools" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m01l01/
src/test/java/handbook/phase09/p09m01l01/
docs/P09.M01.L01-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### P09.M01.L02 Guided Study: Locks, conditions, atomics, and CAS

#### Lesson Overview

- Learning objectives: explain Locks, conditions, atomics, and CAS precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M01.L02; Title=Locks, conditions, atomics, and CAS}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Locks, conditions, atomics, and CAS".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Locks, conditions, atomics, and CAS".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m01l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Locks, conditions, atomics, and CAS".
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

Build a small Java exercise named after $(@{Id=P09.M01.L02; Title=Locks, conditions, atomics, and CAS}.Id):

- Input: a tiny but realistic scenario involving "Locks, conditions, atomics, and CAS".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Locks, conditions, atomics, and CAS" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m01l02/
src/test/java/handbook/phase09/p09m01l02/
docs/P09.M01.L02-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### P09.M01.L03 Guided Study: Java Memory Model

#### Lesson Overview

- Learning objectives: explain Java Memory Model precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M01.L03; Title=Java Memory Model}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Java Memory Model".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Java Memory Model".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m01l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Java Memory Model".
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

Build a small Java exercise named after $(@{Id=P09.M01.L03; Title=Java Memory Model}.Id):

- Input: a tiny but realistic scenario involving "Java Memory Model".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Java Memory Model" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m01l03/
src/test/java/handbook/phase09/p09m01l03/
docs/P09.M01.L03-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### Module 09.01 Project

- Scope: integrate the module lessons: Threads, executors, and thread pools; Locks, conditions, atomics, and CAS; Java Memory Model.
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
- Documentation requirements: explain how the module project uses networking and concurrency and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

### P09.M02.L01 Guided Study: Immutability and confinement

#### Lesson Overview

- Learning objectives: explain Immutability and confinement precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M02.L01; Title=Immutability and confinement}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Immutability and confinement".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Immutability and confinement".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m02l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Immutability and confinement".
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

Build a small Java exercise named after $(@{Id=P09.M02.L01; Title=Immutability and confinement}.Id):

- Input: a tiny but realistic scenario involving "Immutability and confinement".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Immutability and confinement" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m02l01/
src/test/java/handbook/phase09/p09m02l01/
docs/P09.M02.L01-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### P09.M02.L02 Guided Study: Queues, backpressure, and scheduling

#### Lesson Overview

- Learning objectives: explain Queues, backpressure, and scheduling precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M02.L02; Title=Queues, backpressure, and scheduling}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Queues, backpressure, and scheduling".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Queues, backpressure, and scheduling".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m02l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Queues, backpressure, and scheduling".
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

Build a small Java exercise named after $(@{Id=P09.M02.L02; Title=Queues, backpressure, and scheduling}.Id):

- Input: a tiny but realistic scenario involving "Queues, backpressure, and scheduling".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Queues, backpressure, and scheduling" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m02l02/
src/test/java/handbook/phase09/p09m02l02/
docs/P09.M02.L02-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### P09.M02.L03 Guided Study: Lock-free structure basics

#### Lesson Overview

- Learning objectives: explain Lock-free structure basics precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M02.L03; Title=Lock-free structure basics}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Lock-free structure basics".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Lock-free structure basics".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m02l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Lock-free structure basics".
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

Build a small Java exercise named after $(@{Id=P09.M02.L03; Title=Lock-free structure basics}.Id):

- Input: a tiny but realistic scenario involving "Lock-free structure basics".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Lock-free structure basics" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m02l03/
src/test/java/handbook/phase09/p09m02l03/
docs/P09.M02.L03-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### Module 09.02 Project

- Scope: integrate the module lessons: Immutability and confinement; Queues, backpressure, and scheduling; Lock-free structure basics.
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
- Documentation requirements: explain how the module project uses networking and concurrency and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

### P09.M03.L01 Guided Study: Sockets and TCP

#### Lesson Overview

- Learning objectives: explain Sockets and TCP precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M03.L01; Title=Sockets and TCP}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Sockets and TCP".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Sockets and TCP".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m03l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Sockets and TCP".
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

Build a small Java exercise named after $(@{Id=P09.M03.L01; Title=Sockets and TCP}.Id):

- Input: a tiny but realistic scenario involving "Sockets and TCP".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Sockets and TCP" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m03l01/
src/test/java/handbook/phase09/p09m03l01/
docs/P09.M03.L01-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### P09.M03.L02 Guided Study: HTTP/1.1 and HTTP/2

#### Lesson Overview

- Learning objectives: explain HTTP/1.1 and HTTP/2 precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M03.L02; Title=HTTP/1.1 and HTTP/2}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "HTTP/1.1 and HTTP/2".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "HTTP/1.1 and HTTP/2".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m03l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "HTTP/1.1 and HTTP/2".
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

Build a small Java exercise named after $(@{Id=P09.M03.L02; Title=HTTP/1.1 and HTTP/2}.Id):

- Input: a tiny but realistic scenario involving "HTTP/1.1 and HTTP/2".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "HTTP/1.1 and HTTP/2" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m03l02/
src/test/java/handbook/phase09/p09m03l02/
docs/P09.M03.L02-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### P09.M03.L03 Guided Study: Serialization and framing

#### Lesson Overview

- Learning objectives: explain Serialization and framing precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M03.L03; Title=Serialization and framing}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Serialization and framing".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Serialization and framing".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m03l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Serialization and framing".
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

Build a small Java exercise named after $(@{Id=P09.M03.L03; Title=Serialization and framing}.Id):

- Input: a tiny but realistic scenario involving "Serialization and framing".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Serialization and framing" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m03l03/
src/test/java/handbook/phase09/p09m03l03/
docs/P09.M03.L03-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### Module 09.03 Project

- Scope: integrate the module lessons: Sockets and TCP; HTTP/1.1 and HTTP/2; Serialization and framing.
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
- Documentation requirements: explain how the module project uses networking and concurrency and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

### P09.M04.L01 Guided Study: Blocking versus non-blocking I/O

#### Lesson Overview

- Learning objectives: explain Blocking versus non-blocking I/O precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M04.L01; Title=Blocking versus non-blocking I/O}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Blocking versus non-blocking I/O".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Blocking versus non-blocking I/O".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m04l01.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Blocking versus non-blocking I/O".
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

Build a small Java exercise named after $(@{Id=P09.M04.L01; Title=Blocking versus non-blocking I/O}.Id):

- Input: a tiny but realistic scenario involving "Blocking versus non-blocking I/O".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Blocking versus non-blocking I/O" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m04l01/
src/test/java/handbook/phase09/p09m04l01/
docs/P09.M04.L01-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### P09.M04.L02 Guided Study: Reactor pattern and Netty

#### Lesson Overview

- Learning objectives: explain Reactor pattern and Netty precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M04.L02; Title=Reactor pattern and Netty}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Reactor pattern and Netty".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Reactor pattern and Netty".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m04l02.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Reactor pattern and Netty".
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

Build a small Java exercise named after $(@{Id=P09.M04.L02; Title=Reactor pattern and Netty}.Id):

- Input: a tiny but realistic scenario involving "Reactor pattern and Netty".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Reactor pattern and Netty" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m04l02/
src/test/java/handbook/phase09/p09m04l02/
docs/P09.M04.L02-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### P09.M04.L03 Guided Study: Projects: Mini Tomcat and Mini Netty

#### Lesson Overview

- Learning objectives: explain Projects: Mini Tomcat and Mini Netty precisely; implement it in Java; identify where it improves design; critique when it is unnecessary; connect it to networking and concurrency.
- Prerequisites: the previous lesson in this module and all phase-level prerequisites.
- Knowledge dependency graph: $(@{Id=P09.M04.L03; Title=Projects: Mini Tomcat and Mini Netty}.Id) depends on $depends; unlocks $unlocks; future applications include framework internals, production design reviews, and open-source reading.
- Estimated duration: 4 study days, 8-12 focused hours.
- Difficulty: L3-L4.
- Expected outcomes: I can define the concept, implement a small Java example, test it, diagram it, explain trade-offs, and teach it to another engineer.

#### Step 1 - Video First

- Primary lecture: use 22_RESOURCE_CATALOG.md, Video Track P09, selecting the lecture whose topic is closest to "Projects: Mini Tomcat and Mini Netty".
- Required metadata to record in notes: title, instructor, channel, URL, duration, watch speed, timestamps, topics, reason for recommendation, and assumed prior knowledge.
- Watch speed recommendation: 1.0x for first exposure; 1.25x only during revision.
- Timestamps deserving extra attention: opening problem framing, first worked example, first design trade-off, and final summary. Pause and reimplement the example whenever code appears.
- Reason for recommendation: the track prioritizes MIT, Stanford, CMU, university material, official conference talks, and official framework talks over casual videos.

#### Step 2 - Book Reading

- Best book track: Java Concurrency in Practice; Netty in Action; HTTP RFCs 9110-9114.
- Chapters and sections: use the chapter mapping in 22_RESOURCE_CATALOG.md for Phase 9; choose the row matching "Projects: Mini Tomcat and Mini Netty".
- Exact pages: pin to the edition you own; record the page range in your margin notes before starting.
- Pages safe to skip: Skip historical sidebars, language-specific comparisons outside Java, and exercises unrelated to networking and concurrency until quarterly revision.
- Reading objective: extract definitions, invariants, examples, and design forces, not just terminology.
- Estimated reading time: 90-150 minutes.
- Important diagrams: copy any object, sequence, architecture, lifecycle, or state diagram by hand and annotate the dependency direction.
- Definitions to memorize: the central term, its preconditions, its failure mode, and one alternative.
- Examples to reimplement: translate the book example into Java using the package handbook.phase09.lessonp09m04l03.
- Margin notes: mark "why invented", "trade-off", "misuse", "testing consequence", and "open-source sighting".
- Exercises to solve: solve at least three end-of-chapter or self-created exercises: one recall, one implementation, one design critique.

#### Step 3 - Technical Blogs and Primary References

- Martin Fowler or ThoughtWorks: read the relevant article when the lesson touches architecture, refactoring, patterns, enterprise design, microservices, or evolutionary design; write why the article changes how you would design Java code.
- InfoQ or official engineering blog: read one production case study to see operational constraints and team trade-offs.
- Official documentation: read the matching Java, Spring, Hibernate, Kafka, Netty, Tomcat, Redis, Jackson, Guava, JUnit, Mockito, or OkHttp documentation when the concept appears in that ecosystem.
- RFC or research paper: use only when the lesson involves protocols, distributed systems, concurrency, event logs, or consensus; summarize the problem statement and the assumptions.
- Do not dump links into notes. For each reference, write: "I am reading this because..." and "This changes my design by...".

#### Step 4 - Hands-on Implementation

1. Implement the smallest Java example that demonstrates "Projects: Mini Tomcat and Mini Netty".
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

Build a small Java exercise named after $(@{Id=P09.M04.L03; Title=Projects: Mini Tomcat and Mini Netty}.Id):

- Input: a tiny but realistic scenario involving "Projects: Mini Tomcat and Mini Netty".
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
- Connect the concept to Netty, Tomcat, Kafka clients, Redis protocol implementations.
- Refactor the implementation and update tests.
- Time: 2-3 hours.
#### Step 8 - Lab

- Problem statement: design and implement a Java component where "Projects: Mini Tomcat and Mini Netty" is necessary to keep behavior understandable and changeable.
- Requirements: clear public API, enforced invariants, automated tests, meaningful package names, and one diagram.
- Constraints: keep the solution small; prefer explicit Java over framework shortcuts; document every design trade-off.
- Starter structure:

`	ext
src/main/java/handbook/phase09/p09m04l03/
src/test/java/handbook/phase09/p09m04l03/
docs/P09.M04.L03-diagram.md
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

- Why invented: to solve a recurring problem in networking and concurrency where naive code becomes hard to change, test, or reason about.
- What came before: ad hoc procedural logic, duplicated conditionals, informal conventions, or tightly coupled modules.
- Alternatives: simpler direct code, different object model, framework-provided mechanism, data-driven design, or architectural boundary.
- When not to use: when the problem has no real variation, no public API pressure, or no meaningful lifecycle/behavioral complexity.
- Performance implications: identify allocation, dispatch, synchronization, I/O, or serialization costs if present.
- Maintainability implications: improves changeability only when names, boundaries, and tests remain clear.
- Testability implications: should make behavior easier to isolate; if tests become harder, revisit the abstraction.

#### Step 13 - Open Source Connection

Look for the concept in Netty, Tomcat, Kafka clients, Redis protocol implementations. Record:

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

### Module 09.04 Project

- Scope: integrate the module lessons: Blocking versus non-blocking I/O; Reactor pattern and Netty; Projects: Mini Tomcat and Mini Netty.
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
- Documentation requirements: explain how the module project uses networking and concurrency and where it deliberately avoids over-engineering.
- GitHub README expectations: problem, run commands, design overview, trade-offs, test command, known limitations.
- Evaluation rubric: concept integration 35%, correctness 25%, test quality 20%, clarity of design explanation 20%.

