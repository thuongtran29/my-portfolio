# 🚀 Personal Profile Website

A modern, interactive Gen Z-style personal portfolio website.

## ✨ Features

- **Dark/Light/Cyberpunk/Synthwave** themes
- **Hidden terminal** (Ctrl+Shift+T or Ctrl+K)
- **Command palette** with navigation shortcuts
- **Konami code** easter egg (↑↑↓↓←→←→BA)
- **Secret keyword** — type `coffee` anywhere
- **Custom animated cursor** with particle trail
- **Floating particle** background
- **3D tilt** project cards
- **Typing animation** hero section
- **Smooth scroll** reveal animations
- **Floating dock** navigation
- **Live status** messages
- **Random dev quotes** toast
- **Contact form** → Spring Boot REST API
- **Fully responsive** mobile design

## 🗂️ Structure

```
portfolio/
├── index.html              ← Main frontend (self-contained)
├── backend/                ← Spring Boot API
│   └── src/main/java/
│       └── com/yourname/portfolio/
│           ├── controller/ContactController.java
│           ├── service/ContactService.java
│           ├── model/ContactMessage.java
│           └── repository/ContactRepository.java
├── nginx/nginx.conf        ← Reverse proxy config
├── docker/
│   ├── docker-compose.yml
│   ├── Dockerfile.frontend
│   └── Dockerfile.backend
└── .github/workflows/deploy.yml ← CI/CD
```

## 🛠️ Quick Start (Local)

### Frontend only
```bash
# Just open index.html in your browser — no build step needed!
open index.html
```

### With backend
```bash
cd backend
./mvnw spring-boot:run
# API available at http://localhost:8080/api/contact
```

### Full Docker stack
```bash
cd docker
docker compose up -d --build
# Site at http://localhost:80
```

## 🚀 Deployment (VPS/AWS EC2)

1. SSH into your server
2. Clone the repo
3. Set up GitHub Secrets: `VPS_HOST`, `VPS_USER`, `VPS_KEY`
4. Push to `main` → GitHub Actions auto-deploys

## 🔐 SSL (Let's Encrypt)
```bash
sudo certbot --nginx -d yourdomain.com
```
Then uncomment the HTTPS block in `nginx/nginx.conf`.

## 🎮 Easter Eggs

| Secret | How to trigger |
|--------|---------------|
| Terminal | `Ctrl+Shift+T` or dock button |
| Command palette | `Ctrl+K` |
| Konami effect | ↑↑↓↓←→←→BA |
| Synthwave mode | Type `coffee` on the page |
| Fake hack | Open terminal → type `hack` |

## 🎨 Customization

Edit `index.html` and replace:
- `Your Name` → your actual name
- `@yourname` → your username
- Social links → your real profiles
- Projects → your actual projects
- Avatar emoji → your photo or custom emoji

## 📡 API

```
POST /api/contact
Content-Type: application/json

{
  "name": "John",
  "email": "john@example.com",
  "subject": "Hello!",
  "message": "Let's collaborate!"
}
```

Response: `{ "success": true, "message": "Message received!" }`

---
Built with ☕ · HTML5 · CSS3 · JavaScript · Java Spring Boot · Nginx · Docker
