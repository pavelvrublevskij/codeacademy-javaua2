import {Button, Form} from 'react-bootstrap';
import {useState} from "react";

const ContentContainer = () => {

	const [visible, setVisible] = useState(false);

	const [product, setProduct] = useState({
		name: '',
		quantity: 0,
		price: 0,
		description: ''
	})

	const onSubmitEvent = (event: any) => {
		event.preventDefault();

		console.log(event.target[0].name);

		setProduct({
			...product,
			[event.target[0].name]: event.target[0].value,
			[event.target[1].name]: event.target[1].value,
			[event.target[2].name]: event.target[2].value,
			[event.target[3].name]: event.target[3].value,
		});

		setVisible(true);
	}

	return (
		<>
			<Form onSubmit={onSubmitEvent}>
				<Form.Group className='mb-3'>
					<Form.Label>Product name</Form.Label>
					<Form.Control name="name" placeholder='Write name'/>
				</Form.Group>

				<Form.Group className='mb-3' controlId='quantity'>
					<Form.Label>Product quantity</Form.Label>
					<Form.Control name="quantity" placeholder='Write quantity'/>
				</Form.Group>

				<Form.Group className='mb-3'>
					<Form.Label>Product price</Form.Label>
					<Form.Control name="price" placeholder='Write price'/>
				</Form.Group>

				<Form.Group className='mb-3'>
					<Form.Label>Product description</Form.Label>
					<Form.Control name="description" placeholder='Write description'/>
				</Form.Group>

				<Button variant='primary' type='submit'>
					Submit
				</Button>
			</Form>

			{
				visible &&
					<div>
						<hr/>
						<div>
							Created product:
							<div>Name: <strong>{product.name}</strong>
							</div>
							<div>Quantity: <strong>{product.quantity}</strong></div>
							<div>Price: <strong>{product.price}</strong></div>
							<div>Description: <strong>{product.description}</strong></div>
						</div>
					</div>
			}
		</>
	);
}

export default ContentContainer;
