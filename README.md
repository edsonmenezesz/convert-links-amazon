# ConvertAmazonLinks

A small Java utility that converts Amazon product links into affiliate links using a predefined Amazon Associates tag.

## 📌 About the Project

**ConvertAmazonLinks** is a simple Java program created to make the process of generating Amazon affiliate links faster.

Instead of manually editing an Amazon URL, you can copy an Amazon product link and use the program to generate a new link containing the affiliate tag.

The program is designed to work with **non-shortened Amazon links** containing the `/dp/` product path.

### How it works

Given an Amazon product link such as:

```text
https://www.amazon.com.br/dp/EXAMPLE123
```

The program extracts the Amazon domain and product path, then adds the affiliate tag:

```text
https://www.amazon.com.br/dp/EXAMPLE123?tag=barato012-20
```

The affiliate tag is defined directly in the Java application.

## 🛠️ Technologies

* Java
* Eclipse IDE
* Java `URI` class for URL processing

## 📂 Project Structure

```text
ConvertAmazonLinks/
├── src/
│   └── convert/
│       └── ConvertLink.java
├── README.md
└── .gitignore
```

## ▶️ How to Use

1. Copy an Amazon product link.
2. Run the Java program through the **Eclipse IDE**.
3. Enter or provide the copied Amazon link as required by the application.
4. The program processes the URL.
5. The converted affiliate link is generated in the **Command Prompt (CMD)**.

The application checks whether the URL contains the `/dp/` product path. If it does not, the program returns an unsupported-link message.

## ⚙️ Link Processing

The program uses Java's `URI` class to extract:

* The Amazon URL scheme (`https`)
* The Amazon domain
* The product path (`/dp/...`)

It then combines the domain and product path with the predefined affiliate tag.

## ⚠️ Limitations

* Designed for **non-shortened Amazon links**.
* The link must contain the `/dp/` product path.
* Links that do not meet these requirements are rejected as unsupported.
* The affiliate tag is currently defined directly in the source code.

## 🎯 Purpose

This project was created as a small practical exercise in **Java programming**, while also solving a real-world task: quickly converting Amazon product URLs into affiliate links.

## 👨‍💻 Author

**Edson Menezes**

Developed with Java and Eclipse.
