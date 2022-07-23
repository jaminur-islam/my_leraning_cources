const express = require("express");
const app = express();

//======================================================================================= use Ejs ========================================================================================//
app.set("view engine", "ejs");

app
  .route("/user/get/id")
  .get((req, res, next) => {
    res.render("pages/index");
  })
  .post((req, res, next) => {
    res.send("this is post  request");
  })
  .put((req, res, next) => {
    res.send("this is the put request");
  });

/* const blog = express();
const blogAdmin = express(); */

/* app.use("/blog", blog);
blog.use("/admin", blogAdmin);

console.log(app.path());
console.log(blog.path());
console.log(blogAdmin.path());

app.param("id", (req, res, next, id) => {
  res.sendId = id;
  next();
});

app.get("/user/:id", (req, res) => {
  res.send(`this is the id number ${res.sendId}`);
});
 */
/* admin.on("mount", function (parent) {
  console.log("Admin Mounted");
  console.log(parent); // refers to the parent app
});

app.use("/admin", admin); */

/* app.set("myTitle", "this is my title");
console.log(app.get("myTitle"));

app.all("/allMethod", (req, res) => {
  res.send("accept all method");
});

app.use(
  express.static(__dirname + "/public/", {
    index: "home.html",
  })
);

app.post("/", (req, res) => {
  console.log(req.body);
  res.send("This is Post method");
});

app.get("/", (req, res) => {
  res.send("This is get method ");
});


 */

app.listen(5000, () => {
  console.log(`server running port http://localhost:5000`);
});
