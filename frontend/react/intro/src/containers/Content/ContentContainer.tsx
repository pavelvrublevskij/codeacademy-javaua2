import {Button, Form} from 'react-bootstrap';
import {useState} from "react";

const ContentContainer = () => {

	const [productName, setProductName] = useState('');
	const [productQuantity, setProductQuantity] = useState(0);
	const [productPrice, setProductPrice] = useState(0);
	const [productDescr, setProductDescr] = useState('');

	const onSubmitEvent = (event: any) => {
		event.preventDefault();

		setProductName(event.target[0].value);
		setProductQuantity(event.target[1].value);
		setProductPrice(event.target[2].value);
		setProductDescr(event.target[3].value);
	}

	return (
		<>
			<Form onSubmit={onSubmitEvent}>
				<Form.Group className='mb-3'>
					<Form.Label>Product name</Form.Label>
					<Form.Control placeholder='Write name'/>
				</Form.Group>

				<Form.Group className='mb-3' controlId='quantity'>
					<Form.Label>Product quantity</Form.Label>
					<Form.Control placeholder='Write quantity'/>
				</Form.Group>

				<Form.Group className='mb-3'>
					<Form.Label>Product price</Form.Label>
					<Form.Control placeholder='Write price'/>
				</Form.Group>

				<Form.Group className='mb-3'>
					<Form.Label>Product description</Form.Label>
					<Form.Control placeholder='Write description'/>
				</Form.Group>

				<Button variant='primary' type='submit'>
					Submit
				</Button>
			</Form>

			<div>
				<hr/>
				<div>
					Created product:
					<div>Name: <strong>{productName}</strong></div>
					<div>Quantity: <strong>{productQuantity}</strong></div>
					<div>Price: <strong>{productPrice}</strong></div>
					<div>Description: <strong>{productDescr}</strong></div>
				</div>
			</div>
		</>
	);
}

export default ContentContainer;
