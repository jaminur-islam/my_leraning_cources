const express = require("express");
const app = express();
app.locals.title = "shimul";
app.use(
  express.static(__dirname + "/public/", {
    index: "home.html",
  })
);
console.log(__dirname);
console.log("hi get");
app.post("/", (req, res) => {
  console.log(req.body);

  res.send("This is Post method");
});

app.get("/", (req, res) => {
  res.send("This is get method ");
});

module.exports = { app, express };
