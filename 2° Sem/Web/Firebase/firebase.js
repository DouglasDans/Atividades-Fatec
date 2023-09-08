const config1 = { initializeApp, applicationDefault, cert } = require('firebase-admin/app');
const config2 = { getFirestore, Timestamp, FieldValue } = require('firebase-admin/firestore');

const serviceAccount = require("./exercicio-crud-fire-firebase-adminsdk-pgfz4-c59e288b31.json")

const inicializa = config1.initializeApp({
    credential: config1.cert(serviceAccount)
});

const db = getFirestore();

module.exports = {
    config1: config1,
    config2: config2,
    serviceAccount: serviceAccount,
    initializeApp: inicializa,
    db: db,
}