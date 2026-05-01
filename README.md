# 🚀 TaskFlow - Advanced Task Orchestrator

<div align="center">
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" />
  <img src="https://img.shields.io/badge/Express.js-000000?style=for-the-badge&logo=express&logoColor=white" />
  <img src="https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB" />
  <img src="https://img.shields.io/badge/Node.js-339933?style=for-the-badge&logo=node.js&logoColor=white" />
  <img src="https://img.shields.io/badge/Clerk-6C47FF?style=for-the-badge&logo=clerk&logoColor=white" />
</div>

---

## 📌 About the Project

**TaskFlow** is a scalable full-stack task management and orchestration platform built using the **PERN stack (PostgreSQL, Express, React, Node.js)**.

It demonstrates real-world system design by integrating **secure authentication, event-driven workflows, and serverless infrastructure**. The platform is designed to handle **asynchronous task execution, background processing, and high-performance API communication**.

---

## 🚀 Key Features

- 🔐 **Secure Authentication** using Clerk with session management and social login
- ⚡ **Event-Driven Workflows** powered by Inngest for background job execution
- ☁️ **Serverless Database** using Neon PostgreSQL with autoscaling
- 🔄 **Real-time Synchronization** between backend and frontend
- 🧠 **Task Orchestration Engine** for efficient workflow handling
- 🛡️ **Role-Based Access Control** for secure API usage

---

## 💻 Tech Stack

### Frontend
- React.js (Hooks & Functional Components)
- Axios

### Backend
- Node.js
- Express.js

### Database
- Neon (Serverless PostgreSQL)

### Authentication
- Clerk

### Background Processing
- Inngest

---

## 🛡️ Security & Best Practices

- JWT-based authentication using Clerk middleware  
- Protected API routes with token validation  
- Environment variables for sensitive credentials  
- `.env` excluded from version control  
- Secure event handling using Inngest signing keys  

---

## 🛠️ Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/kuverdeep/taskflow.git
cd taskflow
```
### 2. Install Dependencies
```
npm install
```
### 3. Setup Environment Variables
```
# Database (Neon PostgreSQL)
DATABASE_URL=your_neon_db_url

# Clerk Authentication
CLERK_PUBLISHABLE_KEY=your_clerk_pub_key
CLERK_SECRET_KEY=your_clerk_secret

# Inngest Configuration
INNGEST_EVENT_KEY=your_inngest_key
INNGEST_SIGNING_KEY=your_inngest_signing_key
```
### 4. Run Development Server
```
npm run dev
```
