const express = require("express");
const res = require("express/lib/response");
const app = express();

const adminRouter = express.Router();

adminRouter.get("/dashboard", (req, res) => {
  /*   console.log(req.hostname);
  console.log(req.path); */
  console.log(req.ip);
  res.send("hi dashboard");
});

app.use("/admin", adminRouter);

app.get("/user/:id", (req, res) => {
  console.log(req.hostname);
  console.log(req.path);
  res.send("User now coming");
});

app.listen(5000, () => {
  console.log(`server running port http://localhost/5000`);
});
