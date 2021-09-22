import React from 'react';
import Counter from './counter';

export default class Container extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      counts: {}
    };
  }
    countClicks(name) {
      this.setState(state => {
        state.counts[name]
      })
    }
  

 render() {
   return (
     <div>
      <Counter name="One" />
      <Counter name="Two" />
      <Counter name="Three" />
     </div>

   );
 }
} 