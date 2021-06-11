const fs = require('fs')
fs.readFile('./thailand.json', 'utf8', (err, jsonString) => {
    if (err) {
        console.log("Error reading file from disk:", err)
        return
    }
    try {
        console.log("Hello");
        const thailand = JSON.parse(jsonString)
        const provinces = thailand.map((el) => {
            return el.province
        })
        console.log(provinces);
    } catch (err) {
        console.log('Error parsing JSON string:', err)
    }
})