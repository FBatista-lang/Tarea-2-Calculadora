const express = require("express");
const path = require("path");

const app = express();

const expressHbs = require("express-handlebars");

const homeroutes = require("./routes/home");

app.engine("hbs", expressHbs());

app.set("view engine","hbs");
app.set("views","views");

app.use(express.static(path.join(__dirname,"public")));
app.use(homeroutes);

app.use("/", function(req,res,next){

    res.status(404).render("404",{layout: false});

});