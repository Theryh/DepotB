const express = require('express');
const app = express();

app.get('/', (req, resp) => {
  resp.send("Hello, World!");
});

app.listen(8080, () => {
  console.log("Application démarrée sur le port 8080");
});
