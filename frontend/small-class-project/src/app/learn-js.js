
let content = document.getElementById('content');
const value = 'Testassasdasas';
content.innerHTML = `<p>${value}</p>`

let contentArray = document.getElementById('contentArray');
const myArray = ['Ona', 'Petras', 'Dalia', 'Gintaras'];
/*myArray.forEach(val => {
	let paragraph = document.createElement('p');
	paragraph.innerText = val;
	contentArray.appendChild(paragraph);
});*/

let list = document.createElement('ul');
myArray.forEach(val => {
	let listLi = document.createElement('li');
	listLi.innerText = val;
	list.appendChild(listLi);
});
contentArray.appendChild(list)


const data = [
	{
		"id": 1,
		"name": "Petras",
		"surname": "Petraitis",
		"phone": "001"
	},
	{
		"id": 2,
		"name": "Danute",
		"surname": "Petraitiene",
		"phone": "002"
	}
]

let fontSize = 20;
let contentObj = document.getElementById('contentObj');
data.forEach(obj => {
	let paragraph = document.createElement('p');
	paragraph.innerText = `${obj.name} - ${obj.surname} - ${obj.phone}`;
	paragraph.style.fontSize = fontSize + 'px';
	paragraph.style.color = fontSize % 20 ? 'red' : 'green';
	contentObj.appendChild(paragraph);
	fontSize += 10;
});
