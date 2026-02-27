CS 305: Software Security
Southern New Hampshire University

📌 Overview
This repository contains projects and assessments completed as part of the CS 305: Software Security course at SNHU. The course focuses on the analysis of advanced security concepts, the development of secure code, and the implementation of encryption technologies to ensure secure communication.

🎯 Course Competencies
Through this course, I have demonstrated proficiency in the following areas:

Secure Code Analysis (CS-30412): Analyzing how advanced security concepts are applied to develop robust, attack-resistant software.

Security Testing Protocols (CS-30413): Designing and implementing code that complies with industry-standard software security testing.

Encryption & Secure Communication (CS-40414): Writing secure communications using current encryption technologies, ciphers, and techniques.

🛠 Tech Stack & Tools
Language: Java

IDE: Eclipse

Testing: Static Analysis Security Testing (SAST) Tools, JUnit

Key Concepts: Checksum Verification, Certificate Generation (2,048-bit RSA), Vulnerability Reporting, and Mitigation Planning.

📝 Module 8 Journal: Project Reflection
Client Summary and Requirements
Artemis Financial is a financial consulting firm that required a security modernization of their software. The client needed a vulnerability assessment and a security upgrade to protect sensitive financial data. The primary goal was to implement secure communication (HTTPS) and verify that their RESTful services were shielded from common exploits through a proactive "security by design" approach.

Successes and the Value of Security
I excelled at identifying the lack of encryption in the initial software and successfully implementing a 2,048-bit RSA self-signed certificate. Secure coding is essential because it protects user trust and prevents data breaches that can lead to legal and financial ruin. High-quality security adds value to a company’s well-being by maintaining operational integrity and protecting the brand's reputation against cyber threats.

Challenges and Helpful Aspects
The most challenging part of the assessment was navigating the Maven dependency tree to identify outdated libraries with known vulnerabilities (CVEs). This was also the most helpful part of the process, as it taught me how to use automated tools to supplement manual code reviews, ensuring a comprehensive security audit.

Security Layers and Future Mitigation
I increased layers of security by implementing SSL/TLS encryption for data in transit and refactoring the code to use secure hashing algorithms (like SHA-256). In the future, I would use Static Application Security Testing (SAST) tools like SonarQube or Dependency-Check to continuously monitor for vulnerabilities during the development lifecycle.

Functionality and Security Verification
To ensure the application remained functional after refactoring, I utilized JUnit testing to verify that core logic was intact. After adding security features, I performed a "regression security check" by re-running the vulnerability scanner to ensure that the new encryption layers didn't introduce configuration errors or break existing endpoints.

Future Tools and Practices
The most valuable tools used in this project were Java Keytool for certificate management, Maven Dependency Check for library audits, and the Spring Boot Security framework. These tools and the practice of defensive programming will be staple resources in my future back-end development tasks.

Showcasing Skills to Employers
I would show a future employer the Artemis Financial Vulnerability Assessment Report. It demonstrates that I do not just write code that "works," but code that is resilient. It showcases my ability to analyze a system's weaknesses, document risks professionally, and execute a technical remediation plan.

📂 Project Highlights
Project One: Code Review and Mitigation
Objective: Conducted a comprehensive manual and tool-based code review to identify vulnerabilities.

Deliverables: A mitigation plan and refactored code that addresses security flaws identified during static testing.

Project Two: Secure Communications & Vulnerability Reporting
Objective: Implemented secure communication protocols using encryption algorithms and developed a system for improving vulnerability reporting.

Key Tasks: Certificate generation, implementation of algorithm ciphers, and verifying data integrity via checksums.

⚖️ Academic Integrity & AI Disclosure
The work in this repository was completed for academic purposes at Southern New Hampshire University.

AI Usage: Generative AI tools were used as supplemental aids for brainstorming and formatting, following SNHU's guidelines for originality and critical thinking.

Policy: This code is shared to demonstrate my technical growth; if you are a current student, please adhere to your institution's Academic Integrity Policy.

📬 Contact
Name: Matthew Wood

Email: matthew.wood16@snhu.edu

LinkedIn: linkedin.com/in/matthew-r-wood-56b3b44b/
