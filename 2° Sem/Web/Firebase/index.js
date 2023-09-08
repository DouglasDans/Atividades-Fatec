const firestore = require("./firestore")

const add = async function (data) {
    const res = await firestore.db.collection('agendamentos').doc(data.nome).set(data).then(
        console.log("adicionado")
    );
}

const update = async function (collection, doc, data) {
    const ref = firestore.db.collection(collection).doc(doc)
    const res = await ref.update(data).then(console.log("atualizado"))
}


const deletar = async function (collection, doc) {
    const res = await firestore.db.collection(collection).doc(doc).delete().then(
        console.log("deletado")
    );
}

const read = async function (doc) {
    firestore.db.collection('cities').get()
        .then((querySnapshot) => {
            querySnapshot.forEach((doc) => {
            const dados = doc.data();
            console.log(dados);
        });
}).catch((error) => {
    console.error('Erro ao ler dados da coleção:', error);
});

}