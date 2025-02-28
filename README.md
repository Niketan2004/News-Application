# 📰 News Application (Spring Boot + Thymeleaf)

## 🌟 Overview
The **News Application** is a Spring Boot-based web application that provides users with the latest news from around the world. It integrates with the **NewsData.io API** to fetch real-time news data. The application is designed with **Thymeleaf**, **Tailwind CSS**, and follows modular development principles using Thymeleaf fragments to reduce redundant code.

### 🎯 Key Features
- 📌 Fetches real-time news from the **NewsData.io API**
- 🏠 Home page displaying top news from all categories
- 📂 Category-wise filtering of news
- 🔥 Trending news section for top headlines
- 🔎 Planned features: **Search functionality** & **Pagination** for better navigation
- 🎨 Styled using **Tailwind CSS** for a modern and responsive UI
- 🛠 Uses **Thymeleaf fragments** to maintain a clean and modular code structure

---

## 📂 Project Structure
```
News-Application/
│── src/main/java/com/newsapp/
│   ├── Controller/       # Contains all controllers handling user requests
│   ├── Entity/            # Java classes representing data models
│   ├── Services/          # Business logic for fetching news from API
│  
│
│── src/main/resources/
│   ├── static/css/                 # Tailwind CSS files
│   ├── templates/                  # Thymeleaf HTML templates
│   │   ├── fragments/              # Reusable Thymeleaf components
|   |   |    ├── Navbar.html         # Home page for latest news
│   │   |    ├── NewsCards.html      # Category-wise news display
│   │   ├── home.html               # Home page for latest news
│   │   ├── category.html           # Category-wise news display
│   │   ├── trending.html           # Trending news section
│
│── src/main/resources/application.properties   # App configuration file
│── pom.xml     # Dependencies and build configurations
│── README.md   # Documentation
```

---

## ⚙️ How It Works
1. 🏠 **User lands on the Home page** → Displays the latest news from all categories.
2. 📂 **User selects a category** → Filters news based on the chosen category.
3. 🔥 **User clicks on 'Trending'** → Shows top headlines trending worldwide.
4. 🔄 **Data is fetched from NewsData.io API** → Processed using Java and displayed via Thymeleaf.

---

## 🔑 Getting the API Key from NewsData.io
1. Go to **[NewsData.io](https://newsdata.io/)** and **Sign Up**.
2. Navigate to **Dashboard > API Keys**.
3. **Copy your API Key** from the panel.
4. **Set it as a System Environment Variable**:
   - **Windows**: Open CMD and run:  
     ```sh
     setx NEWS_API_KEY_2 "your_api_key_here"
     ```
   - **Mac/Linux**: Open Terminal and run:  
     ```sh
     export NEWS_API_KEY_2="your_api_key_here"
     ```

---

## 🛠️ Installation & Setup
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/Niketan2004/News-Application.git
cd News-Application
```

### 2️⃣ Install Tailwind CSS & Node Modules
Tailwind CSS is used for styling in this project. Install it in the `resources` folder.
```sh
cd src/main/resources/
npm install tailwindcss
```

### 3️⃣ Run the Application
```sh
mvn spring-boot:run
```

### 4️⃣ Access the Application
Once started, open your browser and visit:
```
http://localhost:8080
```
---

### Images

# Home page 
![Image](https://github.com/user-attachments/assets/112effa9-51f6-47a4-a8c8-3ea05e492b93)

# Category
![Image](https://github.com/user-attachments/assets/6bc84fe7-e37a-4a62-baa9-96c42df23676)

# Trending
![Image](https://github.com/user-attachments/assets/cdbd3766-71b0-4800-859a-7a8ec0e07a82)

---

## 📌 Future Improvements
- 🔍 Implementing **search functionality** for finding news articles
- 📄 Adding **pagination** for smoother browsing
- 📌 Allow users to **save favorite news articles**
- 🌓 **Dark Mode** toggle for better user experience

---

## 🤝 Contribution
Contributions are welcome! 🎉 If you have ideas or find bugs, feel free to **open an issue** or **submit a pull request**. Let's build this app together! 🚀

